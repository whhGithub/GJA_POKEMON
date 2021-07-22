package com.whh.character;

//道馆馆长
public class Chot extends Boss{
	private String name;
	//徽章
	public String badge;
	//宝可梦
	private String elvename;
	//绝招
	private String trick;
    //地区
	private String area;
    //难度系数
	private String df;
	public String getElvename() {
		return elvename;
	}

	public void setElvename(String elvename) {
		this.elvename = elvename;
	}

	public String getTrick() {
		return trick;
	}

	public void setTrick(String trick) {
		this.trick = trick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	public String getElve() {
		return elvename;
	}

	public void setElve(String elve) {
		this.elvename = elve;
	}
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public String getDf() {
		return df;
	}

	public void setDf(String df) {
		this.df = df;
	}
}
