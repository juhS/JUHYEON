package com.kh.silsub01_polymorphism.snack.model.vo;

public class Fried extends Snack{
	
	public Fried(int bun, int exp, String kinds) {
		super(bun, exp, kinds);
	}

	@Override
	public void cook() {
		System.out.println("모듬튀김이 노릇노릇하게 튀겨지고 있습니다!");
	}
	
	public void fire() {
		System.out.println("불세기가 약해졌습니다.");
	}
	
	public void timer() {
		System.out.println("타이머 시간이 1분 감소했습니다.");
		super.setBun(super.getBun()-1);
	
		if(super.getBun() <=0) {
			System.out.println("타이머가 울리고있습니다~ 요리 경험이 "+super.getExp()+" 증가했습니다!");
		}
		
	
	
	}
	
	
	
}
