package com.whh.character;

//boss
public class Boss {
	private String name;
	private int le = 5;
	// Ѫ��
	public int blood = 100;
	// ��������
	private double Stract = 5;
	// ��������
	private double protect = 5;
	// ����
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
