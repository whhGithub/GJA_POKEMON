package com.whh.plot;

import java.util.List;

import com.whh.character.Upper;
import com.whh.character.Boss;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Others;
import com.whh.inital.WildBoss;
//宝可梦森林历练ep
//野生宝可梦属性sprintBoss
//创建新的宝可梦newelves
//野生宝可梦bossSet
public class Ep {
	// 宝可梦森林历练ep
	public static Elves ep(Elves e1, Hp p, Boss b, Upper u, List myPokemon) {
		System.out.println("****宝可梦森林****");
		System.out.println("主要野生宝可梦：飞天螳螂，巴大蝶,...");
		System.out.println("是否进入宝可梦森林");
		System.out.println("1.是");
		System.out.println("2.否");
		int c2 = Others.choise();
		if (c2 == 1) {
			WildBoss.bossSet(b, Others.rd());
			System.out.println("1.捕抓");
			System.out.println("2.野外历练");
			int c3 = Others.choise();
			if (c3 == 1) {
				int catch1 = Others.catch1();
				int eifBall = p.getEifBall();
				if (catch1 == 1 || eifBall > 0) {
					p.setElves(p.getElves() + 1);
					p.setEifBall(p.getEifBall() - 1);
					System.out.println("捕抓中....");
					System.out.println(".........");
					System.out.println("哔");
					System.out.println("捕抓成功" + "恭喜你");
					Elves newelves = newelves(b, p);
					myPokemon.add(newelves);
					setNewel(newelves, b);
					return newelves;
				} else {
					System.out.println("捕抓中....");
					System.out.println(".........");
					System.out.println("哔");
					System.out.println("捕抓失败");
				}
			}
			if (c3 == 2) {
				levelUp(e1, u);
				levelUp(e1, u);
				System.out.println("*历练成功*");
				System.out.println("目前宝可梦：" + e1.getName() + "  " + "等级为：" + e1.getLe() + "级");
			}
		}
		if (c2 == 2)

		{
			System.out.println("离开宝可梦森林");
		}
		return e1;

	}
		// 升级历练
	public static void levelUp(Elves e2, Upper u) {
		int i = e2.getEx();
		i += 45;
		if (e2.getLe() < u.getLeMax()) {
			if (i >= 100) {
				e2.setLe(e2.getLe() + 1);
				e2.setStract(e2.getStract() + 1);
				e2.setProtect(e2.getProtect() + 1);
				e2.setEx(0);
			} else {
				e2.setEx(i);
			}
		}
		if (e2.getLe() == u.getLeMax()) {
			e2.setLe(24);
			e2.setStract(24);
			e2.setProtect(24);
			e2.setEx(100);
		}
	}

	// 创建新的宝可梦newelves
	public static Elves newelves(Boss b, Hp p) {
		Elves newelve = new Elves();
		newelve.setName(b.getName());
		if (p.getEifBall() == 3) {
			p.setElve1(b.getName());
		} else if (p.getEifBall() == 2) {
			p.setElve2(b.getName());
		} else if (p.getEifBall() == 1) {
			p.setElve3(b.getName());
		}
		return newelve;
	}
	// 添加宝可梦技能setNewel
	public static void setNewel(Elves newelves, Boss b) {
		newelves.setTrick(b.getTrick());
	}
}
