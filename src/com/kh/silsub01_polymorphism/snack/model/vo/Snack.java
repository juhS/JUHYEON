package com.kh.silsub01_polymorphism.snack.model.vo;

public class Snack {
	
	private int bun; 
	private int exp;
	private String kinds;

	
	public Snack() {}


	public Snack(int bun, int exp, String kinds) {
		this.bun = bun;
		this.exp = exp;
		this.kinds = kinds;
	}


	public int getBun() {
		return bun;
	}


	public void setBun(int bun) {
		this.bun = bun;
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
	
	

	
	public void cook() {
		
		System.out.println("완성되었습니다.!!");
	}


	

}
