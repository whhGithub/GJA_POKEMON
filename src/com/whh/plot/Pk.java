package com.whh.plot;

import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Others;

public class Pk {
	// 发生道馆战斗
		public static void pk(Elves e1, Chot c, Hp p) {
			// 等级高的先攻击
			System.out.println(p.getName() + " 向   " + c.getName() + " 发起挑战！！！");
			System.out.println(p.getName() + "说:" + "出来吧!!!" + e1.getName());
			System.out.println(c.getName() + "说:" + "出来吧!!!" + c.getElvename());
			System.out.println("猛烈的战斗正在进行中....");
			int num = 0;
			if (e1.getStract() - (c.getProtect() * 0.6) < 0) {
				System.out.println(c.getElvename() + "使用绝招：" + c.getTrick() + "  攻击" + e1.getName());
				System.out.println("....");
				System.out.println("....");
				System.out.println(e1.getName() + "使用绝招：" + e1.getTrick() + " 反击" + c.getElvename());
				System.out.println("....");
				System.out.println(e1.getName() + "失去战斗能力");
				PkResult.gue(p, c, Others.rd(), e1);
				return;
			}
			if (e1.getLe() > c.getLe()) {
				System.out.println(e1.getName() + "使用绝招：" + e1.getTrick() + " 攻击" + c.getElvename());
				System.out.println("....");
				System.out.println("....");
				System.out.println(c.getElvename() + "使用绝招：" + c.getTrick() + "  反击" + e1.getName());

				while (true) {
					c.blood -= e1.getStract() - (c.getProtect() * 0.6);
					if (c.getBlood() < 0) {
						break;
					}
					e1.blood -= c.getStract() - (e1.getProtect() * 0.6);
					if (e1.getBlood() < 0) {
						num = 1;
						break;
					}
				}
				System.out.println("....");
				System.out.println(c.getElvename() + "失去战斗能力");
				PkResult.victory(p, c, e1);
				return;
			}
			// 平局
			else if (e1.getLe() == c.getLe()) {
				System.out.println(e1.getName() + "使用绝招：" + e1.getTrick() + " 攻击" + c.getElvename());
				System.out.println("....");
				System.out.println("....");
				System.out.println(c.getElvename() + "使用绝招：" + c.getTrick() + "  反击" + e1.getName());
				System.out.println("....");
				System.out.println(e1.getName() + "使用绝招：" + e1.getTrick() + " 反击" + c.getElvename());
				System.out.println("....");
				PkResult.draw(p, c, e1);
			} else {
				System.out.println(c.getElvename() + "使用绝招：" + c.getTrick() + "  攻击" + e1.getName());
				System.out.println("....");
				System.out.println("....");
				System.out.println(e1.getName() + "使用绝招：" + e1.getTrick() + " 反击" + c.getElvename());
				System.out.println("....");
				System.out.println(e1.getName() + "失去战斗能力");
				while (true) {
					e1.blood -= c.getStract() - (e1.getProtect() * 0.6);
					if (e1.getBlood() < 0) {
						num = 1;
						break;
					}
					c.blood -= e1.getStract() - (c.getProtect() * 0.6);
					if (c.blood < 0) {
						break;
					}
				}
				System.out.println("....");
				PkResult.gue(p, c, Others.rd(), e1);
			}

			return;
		}
		
}
