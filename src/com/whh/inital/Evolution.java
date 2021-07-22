package com.whh.inital;

import com.whh.character.Elves;

public class Evolution {
	// 一阶进化
	public static boolean evolution1(Elves e) {
		String name1 = e.getName();
		if (e.getLe() >= 12) {
			if (e.getName().equals("小火龙") || e.getName().equals("妙蛙种子") || e.getName().equals("杰尼龟")) {
				if (e.getName().equals("小火龙")) {
					e.setName("火恐龙");
				} else if (e.getName().equals("杰尼龟")) {
					e.setName("卡咪龟");

				} else if (e.getName().equals("妙蛙种子")) {
					e.setName("妙蛙草");
				}
				System.out.println("进化中.....哔");
				System.out.println("....");
				e.setProtect(12);
				e.setStract(12);
				System.out.println("恭喜你," + name1 + "进化为：" + e.getName());
				System.out.println("恭喜你," + name1 + "一阶进化完毕");

			} else if (e.getName().equals("皮卡丘")) {
				System.out.println("皮卡丘只能进行二阶进化，继续历练吧~");
			}
		} else {
			System.out.println("宝可梦还未到达12级，暂时还不能进行一阶进化，继续历练吧~");
		}
		return true;
	}

	// 二阶进化
	public static void evolution2(Elves e) {
		String name1 = e.getName();
		if (e.getLe() == 24) {
			if (e.getName().equals("皮卡丘") || e.getName().equals("火恐龙") || e.getName().equals("妙蛙草")
					|| e.getName().equals("卡咪龟")) {
				if (e.getName().equals("火恐龙")) {
					e.setName("喷火龙");
					e.setTrick("闪焰冲锋");
				} else if (e.getName().equals("皮卡丘")) {
					e.setName("雷丘");
					e.setTrick("十万伏特");
				} else if (e.getName().equals("卡咪龟")) {
					e.setName("水箭龟");
					e.setTrick("水之波动");
				} else if (e.getName().equals("妙蛙草")) {
					e.setName("妙蛙花");
					e.setTrick("光合作用");
				}
				System.out.println("进化中.....哔");
				System.out.println("....");
				e.setStract(24);
				e.setProtect(24);
				System.out.println("恭喜你," + name1 + "进化为：" + e.getName());
				System.out.println("恭喜你," + name1 + "二阶进化完毕并且满级");
			} else {
				System.out.println("没有完成一阶进化，无法进行二阶进化");
			}
		} else {
			System.out.println("宝可梦还未到达24级，暂时还不能进行二阶进化，继续历练吧~");

		}
	}
//進化選擇
	public static void ection(Elves elves1) {
		System.out.println("**欢迎来到HAO宝可梦研究中心***");
		System.out.println("****宝可梦进化****");
		System.out.println("1.一阶进化");
		System.out.println("2.二阶进化");
		System.out.println("3.退出进化");
		int cjh = Others.choise();
		if (cjh == 1) {
			Evolution.evolution1(elves1);
		}
		if (cjh == 2) {
			Evolution.evolution2(elves1);
		} else {
			System.out.println("离开HAO宝可梦研究中心");
		}
	}
}
