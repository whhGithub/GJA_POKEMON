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

// ��Ϸϵͳ
public class system {
	public static void system(String a) {
		// TODO Auto-generated method stub
		System.out.println("****GJA_POKEMON****");
		System.out.println("����������Ծ�����д���뱦���εĹ���...");
		System.out.println("����y������ʂ��...");
		// �����û���
		Hp hp1 = new Hp();
		Initial.nameSet(hp1);
		System.out.println("****��ӭ����HAO�о���****");
		// ѡ�񱦿���
		Elves elves1 = new Elves();
		// ���ó�ʼֵ
		Initial.elvesSet(elves1);
		// boss1�趨
		Boss b1 = new Boss();
		// ���������α���
		List<Elves> myPokemon = new ArrayList<>();
		Chot curator1 = new Chot();
		Upper upper = new Upper();
		if (elves1.getName().equals("Ƥ����") || elves1.getName().equals("С����") || elves1.getName().equals("��������")
				|| elves1.getName().equals("�����")) {
			hp1.setElve1(elves1.getName());
			Initial.setTrick(elves1, myPokemon, hp1);
			int num = Others.choise();
			if (num == 1) {
				while (true) {
					upli(elves1);
					if (Others.blardD(elves1)) {
						// ���ȹ���
						Over.aid(elves1, upper);
					}
					System.out.println("----------------");
					System.out.println("1.���и���ð��");
					System.out.println("2.���뱦����ҽԺ~");
					System.out.println("3.�鿴����������");
					System.out.println("4.��������");
					System.out.println("5.�鿴������Ϣ");
					System.out.println("6.���������ν���");
					System.out.println("7.�л�������");
					System.out.println("----------------");
					num = Others.choise();
					if (num == 1) {
						EnterPlot.enterplot(elves1, curator1, hp1, b1, upper, myPokemon);
					} else if (num == 2) {
						// ���뱦����ҽԺ
						Initial1.ralex(elves1, upper);
					} else if (num == 3) {
						// �鿴����������
						Initial1.sprintElve(elves1);
					} else if (num == 5) {
						// �鿴������Ϣ
						Initial1.sprinthp(hp1, elves1);
					} else if (num == 4) {
						// ������Ϸ
						Over.over(hp1, elves1);
						Sava.sava(a, hp1, elves1);
						break;
					} else if (num == 6) {
						// ���������ν���
						Evolution.ection(elves1);
					} else if (num == 7) {
						// �л�������
						System.out.println("***�Ƿ��л�������***");
						System.out.println("1.��");
						System.out.println("2.��");
						int choise = Others.choise();
						if (choise == 1) {
							System.out.println("1.������Ҫ�л��ı����ε����");
							int i = 0;
							for (Elves uname : myPokemon) {
								System.out
										.println("��ţ�" + i++ + " " + "����:" + uname.getName() + "  �ȼ���" + uname.getLe());
							}
							int nump = Others.choise();
							if (nump <= myPokemon.size()) {
								elves1 = myPokemon.get(nump);
								System.out.println("�ГQ�ɹ���");
								System.out.println("Ŀǰ���𱦿��Σ�" + elves1.getName());
							}
						} else {
							System.out.println("��ǰ��ս�����Σ�" + elves1.getName());
						}
					}
				}
				
			} else {
				System.out.println("���Ǽ���Ĵ����~");
			}
		} else

		{
			System.out.println("���о�����ʱû�д˱�����,�ȴ������εĵ���");
		}
	}

	// �ȼ�����
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
		System.out.println("�����Σ�"+elves1.getName()+"  Ŀǰ�ȼ���"+elves1.getLe());
	}
}
