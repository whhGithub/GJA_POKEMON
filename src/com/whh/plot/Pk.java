package com.whh.plot;

import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Others;

public class Pk {
	// ��������ս��
		public static void pk(Elves e1, Chot c, Hp p) {
			// �ȼ��ߵ��ȹ���
			System.out.println(p.getName() + " ��   " + c.getName() + " ������ս������");
			System.out.println(p.getName() + "˵:" + "������!!!" + e1.getName());
			System.out.println(c.getName() + "˵:" + "������!!!" + c.getElvename());
			System.out.println("���ҵ�ս�����ڽ�����....");
			int num = 0;
			if (e1.getStract() - (c.getProtect() * 0.6) < 0) {
				System.out.println(c.getElvename() + "ʹ�þ��У�" + c.getTrick() + "  ����" + e1.getName());
				System.out.println("....");
				System.out.println("....");
				System.out.println(e1.getName() + "ʹ�þ��У�" + e1.getTrick() + " ����" + c.getElvename());
				System.out.println("....");
				System.out.println(e1.getName() + "ʧȥս������");
				PkResult.gue(p, c, Others.rd(), e1);
				return;
			}
			if (e1.getLe() > c.getLe()) {
				System.out.println(e1.getName() + "ʹ�þ��У�" + e1.getTrick() + " ����" + c.getElvename());
				System.out.println("....");
				System.out.println("....");
				System.out.println(c.getElvename() + "ʹ�þ��У�" + c.getTrick() + "  ����" + e1.getName());

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
				System.out.println(c.getElvename() + "ʧȥս������");
				PkResult.victory(p, c, e1);
				return;
			}
			// ƽ��
			else if (e1.getLe() == c.getLe()) {
				System.out.println(e1.getName() + "ʹ�þ��У�" + e1.getTrick() + " ����" + c.getElvename());
				System.out.println("....");
				System.out.println("....");
				System.out.println(c.getElvename() + "ʹ�þ��У�" + c.getTrick() + "  ����" + e1.getName());
				System.out.println("....");
				System.out.println(e1.getName() + "ʹ�þ��У�" + e1.getTrick() + " ����" + c.getElvename());
				System.out.println("....");
				PkResult.draw(p, c, e1);
			} else {
				System.out.println(c.getElvename() + "ʹ�þ��У�" + c.getTrick() + "  ����" + e1.getName());
				System.out.println("....");
				System.out.println("....");
				System.out.println(e1.getName() + "ʹ�þ��У�" + e1.getTrick() + " ����" + c.getElvename());
				System.out.println("....");
				System.out.println(e1.getName() + "ʧȥս������");
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
