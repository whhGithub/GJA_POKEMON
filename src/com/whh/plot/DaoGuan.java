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

	// ��������ս
	public static void daoguan(Elves e1, Chot c, Hp p, Boss b, Upper u, int cmap) {
		System.out.println("****��ӭ����" + c.getArea() + "****");
		System.out.println(c.getDf());
		System.out.println("��Ҫ������" + c.getName() + "������Ϊ:" + c.getBadge());
		System.out.println("1.�˽������");
		System.out.println("2.�x�_" + c.getName());
		int c1 = Others.choise();
		if (c1 == 1) {
			System.out.println("****�Ƿ�鿴��������****");
			System.out.println("1.��");
			System.out.println("2.��");
			int c2 = Others.choise();
			if (c2 == 1) {
				Initial1.sprintcurator(c);
			} else if (c2 == 2) {
				System.out.println("����������ʼ");
			}
			System.out.println("****�Ƿ�ս****");
			System.out.println("1.��");
			System.out.println("2.��");
			if (e1.getBlood() <= u.getBloodMin()) {
				System.out.println("�޷�����ս����������ʮ������");
			}
			if (e1.getBlood() >= u.getBloodMin()) {
				int c4 = Others.choise();
				if (c4 == 1) {
					Pk.pk(e1, c, p);
					Ep.levelUp(e1, u);
					Ep.levelUp(e1, u);
				} else if (c4 == 2) {
					System.out.println("�x�_" + c.getName());
				}
			}
		} else {
			System.out.println("�x�_" + c.getName());
		}

	}

	// ѡ�����
	public static void choiceCity(Chot curator1) {
		System.out.println("***ѡ�����г���***");
		System.out.println("1.������");
		System.out.println("2.������");
		System.out.println("3.�����");
		System.out.println("MAP������~");
		int city = Others.choise();
		if (city == 1) {
			curator1.setElve("����");
			curator1.setBadge("��ɫ����");
			curator1.setName("�������");
			curator1.setTrick("����ǿ��");
			curator1.setArea("������");
			curator1.setDf("***���鱦����5�����ϲ���***");
			curator1.setLe(5);
			curator1.setStract(5);
			curator1.setProtect(5);
		} else if (city == 2) {
			curator1.setElve("����");
			curator1.setBadge("��ɫ����");
			curator1.setName("��������");
			curator1.setTrick("��ɳ");
			curator1.setArea("������");
			curator1.setDf("***���鱦����10�����ϲ���***");
			curator1.setLe(10);
			curator1.setStract(10);
			curator1.setProtect(10);
		} else if (city == 3) {
			curator1.setElve("�»���");
			curator1.setBadge("��ɫ����");
			curator1.setName("��Ƶ���");
			curator1.setTrick("�������");
			curator1.setArea("�����");
			curator1.setDf("***���鱦����20�����ϲ���***");
			curator1.setLe(20);
			curator1.setStract(20);
			curator1.setProtect(20);

		} else {
			System.out.println("������~~");
		}
	}

}