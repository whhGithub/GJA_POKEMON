package com.whh.playGame;
import java.util.*;

import com.whh.log.Registered;
import com.whh.log.Login;
import com.whh.character.Elves;
import com.whh.inital.Others;
import com.whh.system.system;

//PlAY-----GJA_POKEMON
//��Ϸ���section()
//���Q���ɉ�    ����7 replaceElve();
//���߽�B
public class Game1 {
	public static void main(String[] args) {
		System.out.println("****GJA_POKEMON****");
		System.out.println("Please Select");
		System.out.println("1.�û���¼");
		System.out.println("2.�û�ע��");
		System.out.println("3.�ο͵�½");
		System.out.println("4.�˳���Ϸ");
		int dl = Others.choise();
		if (dl == 1) {
			String dl1 = Login.dl1();
			if (dl1 != "") {
				intro(dl1);
			} else {
				System.out.println("��¼ʧ��");
				System.out.println("�����µ�¼...");
				Login.dl1();
			}
		} else if (dl == 2) {
			Registered.registered();
			Login.dl1();
		} else if (dl == 3) {
			System.out.println("***�ο͵�¼�ɹ����ڴ�����ע��***");
			intro("");
		} else {
			System.out.println("�˳��ɹ�");
		}
	}

	// ��Ϸ���section()
	public static void section() {
		System.out.println("----------------");
		System.out.println("1.���и���ð��");
		System.out.println("2.���뱦����ҽԺ~");
		System.out.println("3.�鿴����������");
		System.out.println("4.��������");
		System.out.println("5.�鿴������Ϣ");
		System.out.println("6.���������ν���");
		System.out.println("7.�л�������");
		System.out.println("----------------");
	}

	// ���Q���ɉ� ����7 replaceElve
	public static void replaceElve(Elves elves1, List<Elves> myPokemon) {
		
	}
  
	

	// ��B����
	public static void intro(String dl1) {
		System.out.println("�����ز���Դ�ڣ��ձ�����������ɽ����ִ���ı�����ϵ��");
		System.out.println("���ߣ�19������G5-3������");
		System.out.println("�汾Ϊ��GJA9");
		System.out.println("1.����");
		System.out.println("2.�˳�");
		int introc = Others.choise();
		if (introc == 1) {
			system.system(dl1);
		} else {
			System.out.println("�˳��ɹ�");
		}
	}

}
