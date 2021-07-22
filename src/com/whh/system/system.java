package com.whh.system;

import java.util.ArrayList;
import java.util.List;
import com.whh.character.Upper;
import com.whh.character.Boss;
import com.whh.character.Chot;
import com.whh.character.Elves;
import com.whh.character.Hp;
import com.whh.inital.Initial;
import com.whh.inital.Initial1;
import com.whh.inital.Others;
import com.whh.plot.DaoGuan;
import com.whh.plot.Ep;
import com.whh.inital.Evolution;
import com.whh.log.Over;
import com.whh.log.Sava;
import com.whh.playGame.Game1;
import com.whh.plot.EnterPlot;

// 游戏系统
public class system {
	public static void system(String a) {
		// TODO Auto-generated method stub
		System.out.println("****GJA_POKEMON****");
		System.out.println("在这里你可以尽情书写你与宝可梦的故事...");
		System.out.println("為白銀大會做準備吧...");
		// 创建用户名
		Hp hp1 = new Hp();
		Initial.nameSet(hp1);
		System.out.println("****欢迎来到HAO研究所****");
		// 选择宝可梦
		Elves elves1 = new Elves();
		// 设置初始值
		Initial.elvesSet(elves1);
		// boss1设定
		Boss b1 = new Boss();
		// 创建宝可梦背包
		List<Elves> myPokemon = new ArrayList<>();
		Chot curator1 = new Chot();
		Upper upper = new Upper();
		if (elves1.getName().equals("皮卡丘") || elves1.getName().equals("小火龙") || elves1.getName().equals("妙蛙种子")
				|| elves1.getName().equals("杰尼龟")) {
			hp1.setElve1(elves1.getName());
			Initial.setTrick(elves1, myPokemon, hp1);
			int num = Others.choise();
			if (num == 1) {
				while (true) {
					upli(elves1);
					if (Others.blardD(elves1)) {
						// 急救功能
						Over.aid(elves1, upper);
					}
					System.out.println("----------------");
					System.out.println("1.进行副本冒险");
					System.out.println("2.进入宝可梦医院~");
					System.out.println("3.查看宝可梦属性");
					System.out.println("4.结束旅行");
					System.out.println("5.查看个人信息");
					System.out.println("6.开启宝可梦进化");
					System.out.println("7.切换宝可梦");
					System.out.println("----------------");
					num = Others.choise();
					if (num == 1) {
						EnterPlot.enterplot(elves1, curator1, hp1, b1, upper, myPokemon);
					} else if (num == 2) {
						// 进入宝可梦医院
						Initial1.ralex(elves1, upper);
					} else if (num == 3) {
						// 查看宝可梦属性
						Initial1.sprintElve(elves1);
					} else if (num == 5) {
						// 查看个人信息
						Initial1.sprinthp(hp1, elves1);
					} else if (num == 4) {
						// 结束游戏
						Over.over(hp1, elves1);
						Sava.sava(a, hp1, elves1);
						break;
					} else if (num == 6) {
						// 开启宝可梦进化
						Evolution.ection(elves1);
					} else if (num == 7) {
						// 切换宝可梦
						System.out.println("***是否切换宝可梦***");
						System.out.println("1.是");
						System.out.println("2.否");
						int choise = Others.choise();
						if (choise == 1) {
							System.out.println("1.请输入要切换的宝可梦的序号");
							int i = 0;
							for (Elves uname : myPokemon) {
								System.out
										.println("序号：" + i++ + " " + "名字:" + uname.getName() + "  等级：" + uname.getLe());
							}
							int nump = Others.choise();
							if (nump <= myPokemon.size()) {
								elves1 = myPokemon.get(nump);
								System.out.println("切換成功！");
								System.out.println("目前出戰宝可梦：" + elves1.getName());
							}
						} else {
							System.out.println("当前出战宝可梦：" + elves1.getName());
						}
					}
				}
				
			} else {
				System.out.println("还是家里的床舒服~");
			}
		} else

		{
			System.out.println("本研究所暂时没有此宝可梦,等待宝可梦的到來");
		}
	}

	// 等级上限
	public static void upli(Elves elves1) {
		int le = elves1.getLe();
		if (le >= 24) {
			elves1.setLe(24);
			elves1.setStract(24);
			elves1.setProtect(24);
		}else if(le < 24){
		   elves1.setLe(elves1.getLe());
		   elves1.setStract(elves1.getLe());
		   elves1.setProtect(elves1.getLe());
		}
		System.out.println("宝可梦："+elves1.getName()+"  目前等级："+elves1.getLe());
	}
}
