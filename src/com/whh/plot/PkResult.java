package com.whh.plot;

import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;

public class PkResult {
	// ս��ʧ��
	public static void gue(Hp p, Chot c, int num, Elves e) {
		e.setBlood(e.getBlood() - 30);
		System.out.println("****" + c.getName() + "Ӯ��ʤ��****");
		if (num == 1) {
			System.out.println(p.getName() + "˵:" + "������" + e.getName());
			System.out.println(c.getName() + "˵:" + "������" + c.getElvename());
			System.out.println(c.getName() + "˵��" + p.getName() + "ѵ���Ҽ���ȥ���аɣ���ǿ�˾ͻ�������");
			System.out.println(p.getName() + "˵��" + "�һ�����ģ�����");
		} else {
			System.out.println(p.getName() + "˵��" + "������" + e.getName());
			System.out.println(c.getName() + "˵:" + "������" + c.getElvename());
			System.out.println(c.getName() + "˵��" + "��ӭѵ����" + p.getName() + "�´ι���~~~~");
			System.out.println(p.getName() + "˵��" + "�һ�����ģ�����");
			System.out.println(e.getName() + "Ѫ����" + e.getBlood());
		}

	}

	// ս��ʤ��
	public static void victory(Hp p, Chot c, Elves e) {
		System.out.println("****" + p.getName() + "Ӯ��ʤ��****");
		System.out.println(p.getName() + "˵:" + "������" + e.getName());
		System.out.println(c.getName() + "˵:" + "������" + c.getElvename());
		System.out.println(c.getName() + "˵��" + p.getName() + "(ѵ����)��ϲ����" + c.badge);
		p.setBadge(p.getBadge() + 1);
		e.setLe(e.getLe() + 2);
		System.out.println(p.getName() + "~̤������");
	}

	// ƽ��
	public static void draw(Hp p, Chot c, Elves e) {
		System.out.println("****ƽ��****");
		System.out.println(p.getName() + "˵:" + "������" + e.getName());
		System.out.println(c.getName() + "˵:" + "������" + c.getElvename());
		System.out.println("߀δ�_���Y���Aȡ" + c.badge);
	}

}
