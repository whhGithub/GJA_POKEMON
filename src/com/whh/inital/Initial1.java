package com.whh.inital;
import java.util.List;
import java.util.Scanner;

import com.whh.character.Upper;
import com.whh.character.Boss;
import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.playGame.Game1;
//����sprinthp
//��������sprintcurator
//������ҽԺralex
//����������sprintElve
public class Initial1 {
	// ����
	public static void sprinthp(Hp p,Elves elves1) {
		System.out.println("������" + p.getName());
		System.out.println("���»�ø�����" + p.getBadge());
		System.out.println("�����θ�����" + p.getElves());
		System.out.println("�����������" + p.getEifBall());
		System.out.println("�����ε�һֻ:" + p.getElve1());
		System.out.println("�����εڶ�ֻ:" + p.getElve2());
		System.out.println("�����ε���ֻ:" + p.getElve3());
	}

	// ��������
	public static boolean sprintcurator(Chot c) {
		System.out.println(c.getDf());
		System.out.println("���ݣ�" + c.getName());
		System.out.println("���£�" + c.getBadge());
		System.out.println("���ݱ����Σ�" + c.getElve());
		System.out.println("�����ξ��У�" + c.getTrick());
		return false;
	}

	// ����������
	public static void sprintElve(Elves e1) {
		System.out.println("�����Σ�" + e1.getName());
		System.out.println("�ȼ���" + e1.getLe());
		System.out.println("����ֵ��" + e1.getEx());
		System.out.println("����ֵ��" + e1.getBlood());
		System.out.println("������" + e1.getStract());
		System.out.println("������" + e1.getProtect());
		System.out.println("���У�" + e1.getTrick());
	}

	// ������ҽԺ
	public static void ralex(Elves e, Upper u) {
		if (e.getBlood() == u.getBloodMax()) {
			System.out.println("��������Ѫ����������");

		} else {
			e.setBlood(u.getBloodMax());
			System.out.println("������....��");
			System.out.println(e.getName()+ "��Ѫ����");
		}

	}
}
