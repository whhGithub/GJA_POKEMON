package com.whh.plot;

import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;

public class PkResult {
	// 战斗失败
	public static void gue(Hp p, Chot c, int num, Elves e) {
		e.setBlood(e.getBlood() - 30);
		System.out.println("****" + c.getName() + "赢得胜利****");
		if (num == 1) {
			System.out.println(p.getName() + "说:" + "回来吧" + e.getName());
			System.out.println(c.getName() + "说:" + "回来吧" + c.getElvename());
			System.out.println(c.getName() + "说：" + p.getName() + "训练家继续去旅行吧，变强了就回来找我");
			System.out.println(p.getName() + "说：" + "我会回来的！！！");
		} else {
			System.out.println(p.getName() + "说：" + "回来吧" + e.getName());
			System.out.println(c.getName() + "说:" + "回来吧" + c.getElvename());
			System.out.println(c.getName() + "说：" + "欢迎训练家" + p.getName() + "下次光临~~~~");
			System.out.println(p.getName() + "说：" + "我会回来的！！！");
			System.out.println(e.getName() + "血量：" + e.getBlood());
		}

	}

	// 战斗胜利
	public static void victory(Hp p, Chot c, Elves e) {
		System.out.println("****" + p.getName() + "赢得胜利****");
		System.out.println(p.getName() + "说:" + "回来吧" + e.getName());
		System.out.println(c.getName() + "说:" + "回来吧" + c.getElvename());
		System.out.println(c.getName() + "说：" + p.getName() + "(训练家)恭喜你获得" + c.badge);
		p.setBadge(p.getBadge() + 1);
		e.setLe(e.getLe() + 2);
		System.out.println(p.getName() + "~踏上旅行");
	}

	// 平局
	public static void draw(Hp p, Chot c, Elves e) {
		System.out.println("****平局****");
		System.out.println(p.getName() + "说:" + "回来吧" + e.getName());
		System.out.println(c.getName() + "说:" + "回来吧" + c.getElvename());
		System.out.println("還未達到資格贏取" + c.badge);
	}

}
