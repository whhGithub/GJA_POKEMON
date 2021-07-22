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
		// 进入剧情
		System.out.println("*****冒险方向*****");
		System.out.println("1.城市旅行");
		System.out.println("2.野外历练");
		int cmap = Others.choise();
		if (cmap == 1) {
			DaoGuan.choiceCity(curator1);
			DaoGuan.daoguan(elves1, curator1, hp1, b1, upper, cmap);
		} else if (cmap == 2) {
			Elves ep1 = Ep.ep(elves1, hp1, b1, upper, myPokemon);
		} else {
			System.out.println("本游戏还无其板块，等待更新");
		}
	}
}
