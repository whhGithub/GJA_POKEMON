package com.whh.log;

import com.whh.character.Upper;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Initial1;
import com.whh.inital.Others;

public class Over {
	//��Ϸ����
	public static void over(Hp hp1, Elves elves1) {
		System.out.println("**���н���**");
		System.out.println("�Ƿ�鿴���гɾ�");
		System.out.println("1.��");
		System.out.println("2.��");
		int cend = Others.choise();
		if (cend == 1) {
			System.out.println("*���˳ɾ�*");
			Initial1.sprinthp(hp1, elves1);
			System.out.println("*�����γɾ�*");
			Initial1.sprintElve(elves1);
			System.out.println("��Ϸ����");
		} else {
			System.out.println("��Ϸ����");
		}
            return;
	}
	//���ȹ���
	public static void aid(Elves elves1,Upper upper) {
   System.out.println("�����δ��ˣ���Ҫ�������ƣ�����");
	System.out.println("1.ǰ��������ҽԺ");
	System.out.println("2.��������");
	int czl = Others.choise();
	if (czl == 1) {
		Initial1.ralex(elves1, upper);
	} else {
		System.out.println("��Ϸ����");
	}
	return;
	}
}