package com.whh.inital;

import com.whh.character.Elves;

public class Evolution {
	// һ�׽���
	public static boolean evolution1(Elves e) {
		String name1 = e.getName();
		if (e.getLe() >= 12) {
			if (e.getName().equals("С����") || e.getName().equals("��������") || e.getName().equals("�����")) {
				if (e.getName().equals("С����")) {
					e.setName("�����");
				} else if (e.getName().equals("�����")) {
					e.setName("�����");

				} else if (e.getName().equals("��������")) {
					e.setName("���ܲ�");
				}
				System.out.println("������.....��");
				System.out.println("....");
				e.setProtect(12);
				e.setStract(12);
				System.out.println("��ϲ��," + name1 + "����Ϊ��" + e.getName());
				System.out.println("��ϲ��," + name1 + "һ�׽������");

			} else if (e.getName().equals("Ƥ����")) {
				System.out.println("Ƥ����ֻ�ܽ��ж��׽���������������~");
			}
		} else {
			System.out.println("�����λ�δ����12������ʱ�����ܽ���һ�׽���������������~");
		}
		return true;
	}

	// ���׽���
	public static void evolution2(Elves e) {
		String name1 = e.getName();
		if (e.getLe() == 24) {
			if (e.getName().equals("Ƥ����") || e.getName().equals("�����") || e.getName().equals("���ܲ�")
					|| e.getName().equals("�����")) {
				if (e.getName().equals("�����")) {
					e.setName("�����");
					e.setTrick("������");
				} else if (e.getName().equals("Ƥ����")) {
					e.setName("����");
					e.setTrick("ʮ�����");
				} else if (e.getName().equals("�����")) {
					e.setName("ˮ����");
					e.setTrick("ˮ֮����");
				} else if (e.getName().equals("���ܲ�")) {
					e.setName("���ܻ�");
					e.setTrick("�������");
				}
				System.out.println("������.....��");
				System.out.println("....");
				e.setStract(24);
				e.setProtect(24);
				System.out.println("��ϲ��," + name1 + "����Ϊ��" + e.getName());
				System.out.println("��ϲ��," + name1 + "���׽�����ϲ�������");
			} else {
				System.out.println("û�����һ�׽������޷����ж��׽���");
			}
		} else {
			System.out.println("�����λ�δ����24������ʱ�����ܽ��ж��׽���������������~");

		}
	}
//�M���x��
	public static void ection(Elves elves1) {
		System.out.println("**��ӭ����HAO�������о�����***");
		System.out.println("****�����ν���****");
		System.out.println("1.һ�׽���");
		System.out.println("2.���׽���");
		System.out.println("3.�˳�����");
		int cjh = Others.choise();
		if (cjh == 1) {
			Evolution.evolution1(elves1);
		}
		if (cjh == 2) {
			Evolution.evolution2(elves1);
		} else {
			System.out.println("�뿪HAO�������о�����");
		}
	}
}
