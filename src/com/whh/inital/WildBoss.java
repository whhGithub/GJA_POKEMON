package com.whh.inital;

import com.whh.character.Boss;

public class WildBoss {
	// Ұ������������sprintBoss
		public static void sprintBoss(Boss b) {
			System.out.println("���֣�" + b.getName());
			System.out.println("�ȼ���" + b.getLe());
			System.out.println("����ֵ��" + b.getBlood());
			System.out.println("������" + b.getStract());
			System.out.println("������" + b.getProtect());
		}
		// Ұ��������bossSet
			public static void bossSet(Boss b, int num) {
				if (num == 1) {
					b.setName("�������");
					b.setTrick("�ɵ���");
				} else if (num == 2) {
					b.setName("�ʹ��");
					b.setTrick("������");
				} else if (num == 3) {
					b.setName("����Ӽ");
					b.setTrick("����");
				} else {
					b.setName("�ȱ���");
					b.setTrick("��򹥻�");
				}
				System.out.println("ż��" + b.getName());
			}
}
