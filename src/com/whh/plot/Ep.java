package com.whh.plot;

import java.util.List;

import com.whh.character.Upper;
import com.whh.character.Boss;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Others;
import com.whh.inital.WildBoss;
//������ɭ������ep
//Ұ������������sprintBoss
//�����µı�����newelves
//Ұ��������bossSet
public class Ep {
	// ������ɭ������ep
	public static Elves ep(Elves e1, Hp p, Boss b, Upper u, List myPokemon) {
		System.out.println("****������ɭ��****");
		System.out.println("��ҪҰ�������Σ�������룬�ʹ��,...");
		System.out.println("�Ƿ���뱦����ɭ��");
		System.out.println("1.��");
		System.out.println("2.��");
		int c2 = Others.choise();
		if (c2 == 1) {
			WildBoss.bossSet(b, Others.rd());
			System.out.println("1.��ץ");
			System.out.println("2.Ұ������");
			int c3 = Others.choise();
			if (c3 == 1) {
				int catch1 = Others.catch1();
				int eifBall = p.getEifBall();
				if (catch1 == 1 || eifBall > 0) {
					p.setElves(p.getElves() + 1);
					p.setEifBall(p.getEifBall() - 1);
					System.out.println("��ץ��....");
					System.out.println(".........");
					System.out.println("��");
					System.out.println("��ץ�ɹ�" + "��ϲ��");
					Elves newelves = newelves(b, p);
					myPokemon.add(newelves);
					setNewel(newelves, b);
					return newelves;
				} else {
					System.out.println("��ץ��....");
					System.out.println(".........");
					System.out.println("��");
					System.out.println("��ץʧ��");
				}
			}
			if (c3 == 2) {
				levelUp(e1, u);
				levelUp(e1, u);
				System.out.println("*�����ɹ�*");
				System.out.println("Ŀǰ�����Σ�" + e1.getName() + "  " + "�ȼ�Ϊ��" + e1.getLe() + "��");
			}
		}
		if (c2 == 2)

		{
			System.out.println("�뿪������ɭ��");
		}
		return e1;

	}
		// ��������
	public static void levelUp(Elves e2, Upper u) {
		int i = e2.getEx();
		i += 45;
		if (e2.getLe() < u.getLeMax()) {
			if (i >= 100) {
				e2.setLe(e2.getLe() + 1);
				e2.setStract(e2.getStract() + 1);
				e2.setProtect(e2.getProtect() + 1);
				e2.setEx(0);
			} else {
				e2.setEx(i);
			}
		}
		if (e2.getLe() == u.getLeMax()) {
			e2.setLe(24);
			e2.setStract(24);
			e2.setProtect(24);
			e2.setEx(100);
		}
	}

	// �����µı�����newelves
	public static Elves newelves(Boss b, Hp p) {
		Elves newelve = new Elves();
		newelve.setName(b.getName());
		if (p.getEifBall() == 3) {
			p.setElve1(b.getName());
		} else if (p.getEifBall() == 2) {
			p.setElve2(b.getName());
		} else if (p.getEifBall() == 1) {
			p.setElve3(b.getName());
		}
		return newelve;
	}
	// ��ӱ����μ���setNewel
	public static void setNewel(Elves newelves, Boss b) {
		newelves.setTrick(b.getTrick());
	}
}
