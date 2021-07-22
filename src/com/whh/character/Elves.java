package com.whh.character;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//精灵
public class Elves implements Comparable<Elves> {
	//名字
	private String name;
	//经验
	private int ex = 0;
	// 血条
	public int blood = 100;
	// 攻击力量
	private int stract = 5;
	// 防御力量
	private int protect = 5;
	// 等级
	private int le = 5;
	//绝招
	private String trick;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getStract() {
		return stract;
	}
	public void setStract(int stract) {
		this.stract = stract;
	}
	public int getProtect() {
		return protect;
	}
	public void setProtect(int protect) {
		this.protect = protect;
	}
	public int getLe() {
		return le;
	}
	public void setLe(int le) {
		this.le = le;
	}
	public String getTrick() {
		return trick;
	}
	public void setTrick(String trick) {
		this.trick = trick;
	}
	@Override
	public int compareTo(Elves o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		boolean isEquals = false;
		
		if(obj instanceof Elves) {
			Elves pname = (Elves)obj;
			if(this.name != null && pname.name != null && this.name.equals(pname.name)) {
				isEquals = true;
			}
		}
		return isEquals;	
	}
	@Override
	public String toString() {
		return "elves [name=" + name + ", ex=" + ex + ", blood=" + blood + ", stract=" + stract + ", protect=" + protect
				+ ", le=" + le + ", trick=" + trick + "]";
	}
	

}
