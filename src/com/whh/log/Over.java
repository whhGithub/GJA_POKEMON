package com.whh.log;

import com.whh.character.Upper;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Initial1;
import com.whh.inital.Others;

public class Over {
	//游戏结束
	public static void over(Hp hp1, Elves elves1) {
		System.out.println("**旅行结束**");
		System.out.println("是否查看旅行成就");
		System.out.println("1.是");
		System.out.println("2.否");
		int cend = Others.choise();
		if (cend == 1) {
			System.out.println("*个人成就*");
			Initial1.sprinthp(hp1, elves1);
			System.out.println("*宝可梦成就*");
			Initial1.sprintElve(elves1);
			System.out.println("游戏结束");
		} else {
			System.out.println("游戏结束");
		}
            return;
	}
	//急救功能
	public static void aid(Elves elves1,Upper upper) {
   System.out.println("宝可梦创伤，需要立刻治疗！！！");
	System.out.println("1.前往宝可梦医院");
	System.out.println("2.结束旅行");
	int czl = Others.choise();
	if (czl == 1) {
		Initial1.ralex(elves1, upper);
	} else {
		System.out.println("游戏结束");
	}
	return;
	}
}