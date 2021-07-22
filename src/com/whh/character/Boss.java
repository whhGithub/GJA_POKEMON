package com.whh.character;

//boss
public class Boss {
	private String name;
	private int le = 5;
	// 血条
	public int blood = 100;
	// 攻击力量
	private double Stract = 5;
	// 防御力量
	private double protect = 5;
	// 绝招
	private String trick;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLe() {
		return le;
	}

	public void setLe(int le) {
		this.le = le;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public double getStract() {
		return Stract;
	}

	public void setStract(double stract) {
		Stract = stract;
	}

	public double getProtect() {
		return protect;
	}

	public void setProtect(double protect) {
		this.protect = protect;
	}

	public String getTrick() {
		return trick;
	}

	public void setTrick(String trick) {
		this.trick = trick;
	}
	
}
