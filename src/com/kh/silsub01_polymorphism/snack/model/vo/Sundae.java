package com.kh.silsub01_polymorphism.snack.model.vo;

public class Sundae extends Snack {
	
	public Sundae(int bun, int exp, String kinds) {
		super(bun, exp, kinds);
	}
	
	@Override
	public void cook() {
		System.out.println("순대를 조리중입니다~~");
	}
	
	public void reheat() {
		System.out.println("조리시간 2분 감소되었습니다.");
		super.setBun(super.getBun()-2);
		
		if(super.getBun() <=0) {
			System.out.println("순대가 완성되었습니다. 조리경험이 "+super.getExp()+"만큼 증가되었습니다.");
		}
		
	}
	

}
