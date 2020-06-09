package com.kh.silsub01_polymorphism.snack.model.vo;

public class Tteokbokki extends Snack {
	
	
	public Tteokbokki(int bun, int exp, String kinds) {
		super(bun, exp, kinds);
				
	}
	
	@Override
	public void cook() {
		System.out.println("떡볶이를 맛있게 조리중입니다~");
	}
	
	public void lack() {
		System.out.println("재료가 부족합니다.");
	}
	
	public void food() {
		System.out.println("완성까지 3분 감소했습니다.");
		super.setBun(super.getBun()-3);
	
		if(super.getBun()<=0) {
			System.out.println("음식이 완성되었습니다. "
					+ "요리 경험치가 "+super.getExp()+"만큼 증가했습니다.");
		}
	}

	
	
}
