package com.whh.playGame;
import java.util.*;

import com.whh.log.Registered;
import com.whh.log.Login;
import com.whh.character.Elves;
import com.whh.inital.Others;
import com.whh.system.system;

//PlAY-----GJA_POKEMON
//游戏板块section()
//更換寶可夢    功能7 replaceElve();
//作者介紹
public class Game1 {
	public static void main(String[] args) {
		System.out.println("****GJA_POKEMON****");
		System.out.println("Please Select");
		System.out.println("1.用户登录");
		System.out.println("2.用户注册");
		System.out.println("3.游客登陆");
		System.out.println("4.退出游戏");
		int dl = Others.choise();
		if (dl == 1) {
			String dl1 = Login.dl1();
			if (dl1 != "") {
				intro(dl1);
			} else {
				System.out.println("登录失败");
				System.out.println("请重新登录...");
				Login.dl1();
			}
		} else if (dl == 2) {
			Registered.registered();
			Login.dl1();
		} else if (dl == 3) {
			System.out.println("***游客登录成功，期待您的注册***");
			intro("");
		} else {
			System.out.println("退出成功");
		}
	}

	// 游戏板块section()
	public static void section() {
		System.out.println("----------------");
		System.out.println("1.进行副本冒险");
		System.out.println("2.进入宝可梦医院~");
		System.out.println("3.查看宝可梦属性");
		System.out.println("4.结束旅行");
		System.out.println("5.查看个人信息");
		System.out.println("6.开启宝可梦进化");
		System.out.println("7.切换宝可梦");
		System.out.println("----------------");
	}

	// 更換寶可夢 功能7 replaceElve
	public static void replaceElve(Elves elves1, List<Elves> myPokemon) {
		
	}
  
	

	// 介紹作者
	public static void intro(String dl1) {
		System.out.println("创作素材来源于：日本动漫导演汤山邦彦执导的宝可梦系列");
		System.out.println("作者：19互联网G5-3班吴洪豪");
		System.out.println("版本为：GJA9");
		System.out.println("1.继续");
		System.out.println("2.退出");
		int introc = Others.choise();
		if (introc == 1) {
			system.system(dl1);
		} else {
			System.out.println("退出成功");
		}
	}

}
