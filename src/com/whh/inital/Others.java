package com.whh.inital;

import java.util.Random;
import java.util.Scanner;

import com.whh.character.Elves;

public class Others {
	// ѡ��
	public static int choise() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	// Ѫ���ж�
	public static boolean blardD(Elves e1) {
		if (e1.getBlood() <= 0) {
			return true;
		}
		return false;
	}

	// ���װ��
	public static int rd() {
		Random rd = new Random();
		int num = rd.nextInt(3) + 1;
		return num;
	}

	// ��ץ
	public static int catch1() {
		return rd();
	}
}
