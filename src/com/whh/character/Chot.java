package com.whh.character;

//���ݹݳ�
public class Chot extends Boss{
	private String name;
	//����
	public String badge;
	//������
	private String elvename;
	//����
	private String trick;
    //����
	private String area;
    //�Ѷ�ϵ��
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
