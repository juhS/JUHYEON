package com.kh.silsub01_polymorphism.snack.model.vo;

public class Player {
	
	private String name;
	private int exp = 0;
	private String kinds;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return name + "님의 요리 경험치는 " + exp + "입니다." + kinds +"타이틀을 얻었습니다.";
	}
	
	
}
