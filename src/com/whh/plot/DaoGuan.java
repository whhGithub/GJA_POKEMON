package com.whh.plot;

import com.whh.character.Upper;
import com.whh.character.Boss;
import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Initial1;
import com.whh.inital.Others;
import com.whh.playGame.Game1;
import com.whh.plot.Pk;
import com.whh.plot.Ep;

public class DaoGuan {

	// 道馆赛开战
	public static void daoguan(Elves e1, Chot c, Hp p, Boss b, Upper u, int cmap) {
		System.out.println("****欢迎来到" + c.getArea() + "****");
		System.out.println(c.getDf());
		System.out.println("主要道馆有" + c.getName() + "，徽章为:" + c.getBadge());
		System.out.println("1.了解道馆赛");
		System.out.println("2.離開" + c.getName());
		int c1 = Others.choise();
		if (c1 == 1) {
			System.out.println("****是否查看道馆资料****");
			System.out.println("1.是");
			System.out.println("2.否");
			int c2 = Others.choise();
			if (c2 == 1) {
				Initial1.sprintcurator(c);
			} else if (c2 == 2) {
				System.out.println("比赛即将开始");
			}
			System.out.println("****是否开战****");
			System.out.println("1.是");
			System.out.println("2.否");
			if (e1.getBlood() <= u.getBloodMin()) {
				System.out.println("无法进入战斗，宝可梦十分虚弱");
			}
			if (e1.getBlood() >= u.getBloodMin()) {
				int c4 = Others.choise();
				if (c4 == 1) {
					Pk.pk(e1, c, p);
					Ep.levelUp(e1, u);
					Ep.levelUp(e1, u);
				} else if (c4 == 2) {
					System.out.println("離開" + c.getName());
				}
			}
		} else {
			System.out.println("離開" + c.getName());
		}

	}

	// 选择城市
	public static void choiceCity(Chot curator1) {
		System.out.println("***选择旅行城市***");
		System.out.println("1.常青市");
		System.out.println("2.华蓝市");
		System.out.println("3.金黄市");
		System.out.println("MAP更新中~");
		int city = Others.choise();
		if (city == 1) {
			curator1.setElve("胡地");
			curator1.setBadge("绿色徽章");
			curator1.setName("常青道馆");
			curator1.setTrick("精神强念");
			curator1.setArea("常青市");
			curator1.setDf("***建议宝可梦5级以上参赛***");
			curator1.setLe(5);
			curator1.setStract(5);
			curator1.setProtect(5);
		} else if (city == 2) {
			curator1.setElve("波波");
			curator1.setBadge("蓝色徽章");
			curator1.setName("华蓝道馆");
			curator1.setTrick("泼沙");
			curator1.setArea("华蓝市");
			curator1.setDf("***建议宝可梦10级以上参赛***");
			curator1.setLe(10);
			curator1.setStract(10);
			curator1.setProtect(10);
		} else if (city == 3) {
			curator1.setElve("勇基拉");
			curator1.setBadge("金色徽章");
			curator1.setName("金黄道馆");
			curator1.setTrick("幻象光线");
			curator1.setArea("金黄市");
			curator1.setDf("***建议宝可梦20级以上参赛***");
			curator1.setLe(20);
			curator1.setStract(20);
			curator1.setProtect(20);

		} else {
			System.out.println("旅行中~~");
		}
	}

}