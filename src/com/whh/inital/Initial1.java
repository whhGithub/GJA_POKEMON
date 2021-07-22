package com.whh.inital;
import java.util.List;
import java.util.Scanner;

import com.whh.character.Upper;
import com.whh.character.Boss;
import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.playGame.Game1;
//人物sprinthp
//道馆资料sprintcurator
//宝可梦医院ralex
//宝可梦属性sprintElve
public class Initial1 {
	// 人物
	public static void sprinthp(Hp p,Elves elves1) {
		System.out.println("姓名：" + p.getName());
		System.out.println("徽章获得个数：" + p.getBadge());
		System.out.println("宝可梦个数：" + p.getElves());
		System.out.println("精灵球个数：" + p.getEifBall());
		System.out.println("宝可梦第一只:" + p.getElve1());
		System.out.println("宝可梦第二只:" + p.getElve2());
		System.out.println("宝可梦第三只:" + p.getElve3());
	}

	// 道馆资料
	public static boolean sprintcurator(Chot c) {
		System.out.println(c.getDf());
		System.out.println("道馆：" + c.getName());
		System.out.println("徽章：" + c.getBadge());
		System.out.println("道馆宝可梦：" + c.getElve());
		System.out.println("宝可梦绝招：" + c.getTrick());
		return false;
	}

	// 宝可梦属性
	public static void sprintElve(Elves e1) {
		System.out.println("宝可梦：" + e1.getName());
		System.out.println("等级：" + e1.getLe());
		System.out.println("经验值：" + e1.getEx());
		System.out.println("生命值：" + e1.getBlood());
		System.out.println("攻击：" + e1.getStract());
		System.out.println("防御：" + e1.getProtect());
		System.out.println("绝招：" + e1.getTrick());
	}

	// 宝可梦医院
	public static void ralex(Elves e, Upper u) {
		if (e.getBlood() == u.getBloodMax()) {
			System.out.println("宝可梦满血，无需治疗");

		} else {
			e.setBlood(u.getBloodMax());
			System.out.println("治疗中....哔");
			System.out.println(e.getName()+ "满血复活");
		}

	}
}
