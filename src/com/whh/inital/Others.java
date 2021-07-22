package com.whh.inital;

import java.util.Random;
import java.util.Scanner;

import com.whh.character.Elves;

public class Others {
	// 选择
	public static int choise() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	// 血条判断
	public static boolean blardD(Elves e1) {
		if (e1.getBlood() <= 0) {
			return true;
		}
		return false;
	}

	// 随机装置
	public static int rd() {
		Random rd = new Random();
		int num = rd.nextInt(3) + 1;
		return num;
	}

	// 捕抓
	public static int catch1() {
		return rd();
	}
}
