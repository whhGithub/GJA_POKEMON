package com.whh.plot;

import java.util.List;
import com.whh.character.Upper;
import com.whh.character.Boss;
import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Others;


public class EnterPlot {
	public static void enterplot(Elves elves1,Chot curator1,Hp hp1,Boss b1,Upper upper,List<Elves>myPokemon) {
		// �������
		System.out.println("*****ð�շ���*****");
		System.out.println("1.��������");
		System.out.println("2.Ұ������");
		int cmap = Others.choise();
		if (cmap == 1) {
			DaoGuan.choiceCity(curator1);
			DaoGuan.daoguan(elves1, curator1, hp1, b1, upper, cmap);
		} else if (cmap == 2) {
			Elves ep1 = Ep.ep(elves1, hp1, b1, upper, myPokemon);
		} else {
			System.out.println("����Ϸ�������飬�ȴ�����");
		}
	}
}
