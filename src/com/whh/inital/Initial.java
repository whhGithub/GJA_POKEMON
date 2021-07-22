package com.whh.inital;
import java.util.List;
import java.util.Scanner;

import com.whh.character.Boss;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.playGame.Game1;
//创建新名字nameSet
//宝可梦选择elvesSet
//宝可梦绝招的初始定义,以及将宝可梦放入数组列表中setTrick
//添加宝可梦技能setNewel
public class Initial {
	   // 创建新名字
		public static void nameSet(Hp p) {
			Scanner sc = new Scanner(System.in);
			System.out.print("创建用户名：");
			p.setName(sc.nextLine());
			p.setBadge(0);
		}

		// 宝可梦选择
		public static void elvesSet(Elves e) {
			System.out.println("****选择宝可梦****");
			System.out.println("皮卡丘 杰尼龟 妙蛙花 小火龙");
			System.out.print("你的选择是:");
			Scanner sc1 = new Scanner(System.in);
			e.setName(sc1.nextLine());
		}

		// 宝可梦绝招的初始定义,以及将宝可梦放入数组列表中
		public static void setTrick(Elves elves1, List<Elves> myPokemon, Hp hp1) {
			if (elves1.getName().equals("皮卡丘")) {
				elves1.setTrick("電光一閃");
				myPokemon.add(elves1);
			} else if (elves1.getName().equals("杰尼龟")) {
				elves1.setTrick("水枪");
				myPokemon.add(elves1);
			} else if (elves1.getName().equals("妙蛙种子")) {
				elves1.setTrick("藤鞭");
				myPokemon.add(elves1);
			} else if (elves1.getName().equals("小火龙")) {
				elves1.setTrick("喷射火焰");
				myPokemon.add(elves1);
			}
			System.out.println("恭喜你获得宝可梦：" + elves1.getName());
			System.out.println("当前背包内有宝可梦：" + myPokemon);
			hp1.setElves(hp1.getElves() + 1);
			System.out.println("***你与宝可梦的冒险之旅开始即将啦~***");
			System.out.println("1.开启冒险之旅");
			System.out.println("2.回家洗洗睡");
		}

}
