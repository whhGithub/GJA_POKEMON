package com.whh.inital;
import java.util.List;
import java.util.Scanner;

import com.whh.character.Boss;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.playGame.Game1;
//����������nameSet
//������ѡ��elvesSet
//�����ξ��еĳ�ʼ����,�Լ��������η��������б���setTrick
//��ӱ����μ���setNewel
public class Initial {
	   // ����������
		public static void nameSet(Hp p) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�����û�����");
			p.setName(sc.nextLine());
			p.setBadge(0);
		}

		// ������ѡ��
		public static void elvesSet(Elves e) {
			System.out.println("****ѡ�񱦿���****");
			System.out.println("Ƥ���� ����� ���ܻ� С����");
			System.out.print("���ѡ����:");
			Scanner sc1 = new Scanner(System.in);
			e.setName(sc1.nextLine());
		}

		// �����ξ��еĳ�ʼ����,�Լ��������η��������б���
		public static void setTrick(Elves elves1, List<Elves> myPokemon, Hp hp1) {
			if (elves1.getName().equals("Ƥ����")) {
				elves1.setTrick("늹�һ�W");
				myPokemon.add(elves1);
			} else if (elves1.getName().equals("�����")) {
				elves1.setTrick("ˮǹ");
				myPokemon.add(elves1);
			} else if (elves1.getName().equals("��������")) {
				elves1.setTrick("�ٱ�");
				myPokemon.add(elves1);
			} else if (elves1.getName().equals("С����")) {
				elves1.setTrick("�������");
				myPokemon.add(elves1);
			}
			System.out.println("��ϲ���ñ����Σ�" + elves1.getName());
			System.out.println("��ǰ�������б����Σ�" + myPokemon);
			hp1.setElves(hp1.getElves() + 1);
			System.out.println("***���뱦���ε�ð��֮�ÿ�ʼ������~***");
			System.out.println("1.����ð��֮��");
			System.out.println("2.�ؼ�ϴϴ˯");
		}

}
