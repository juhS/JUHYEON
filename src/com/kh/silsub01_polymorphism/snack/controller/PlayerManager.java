package com.kh.silsub01_polymorphism.snack.controller;

import com.kh.silsub01_polymorphism.snack.model.vo.Fried;
import com.kh.silsub01_polymorphism.snack.model.vo.Player;
import com.kh.silsub01_polymorphism.snack.model.vo.Snack;
import com.kh.silsub01_polymorphism.snack.model.vo.Sundae;
import com.kh.silsub01_polymorphism.snack.model.vo.Tteokbokki;

public class PlayerManager {

	public void starPlay(String name) {
		
		Player p = new Player(name);
		
		System.out.println(p.getName() + "님께서 조리를 시작했습니다~박수짝짝");
		
		
		Snack c1 = new Tteokbokki(50,50,"수습생");
		c1.cook();
			
	
		//조리시간 감소
		if(c1 instanceof Tteokbokki) {
			((Tteokbokki) c1).food();
		}
		
		for(int i = c1.getBun(); i >0; i-=3){
			if(c1 instanceof Tteokbokki ) {
				((Tteokbokki) c1).food();
			}
		}
		
		//경험치 증가
		p.setExp(p.getExp()+c1.getExp());
		p.setKinds(c1.getKinds());
		
		//정보확인
		System.out.println(p);
	
		Snack c2 = new Tteokbokki(70,70,"3급조리사");
		c2.cook();
	
		//조리시간 감소
		if(c2 instanceof Tteokbokki) {
			((Tteokbokki) c2).food();
		}
		
		for(int i = c2.getBun(); i >0; i-=3){
			if(c2 instanceof Tteokbokki ) {
				((Tteokbokki) c2).food();
			}
		}
		
		//경험치 증가
		p.setExp(p.getExp()+c2.getExp());
		p.setKinds(c2.getKinds());
		
		//정보확인
		System.out.println(p);	
		
		
		
		Snack c3 = new Tteokbokki(100,100,"2급조리사");
		c3.cook();
		
		//조리시간 감소
		if(c3 instanceof Tteokbokki) {
			((Tteokbokki) c3).food();
		}
		
		for(int i = c3.getBun(); i >0; i-=3){
			if(c3 instanceof Tteokbokki ) {
				((Tteokbokki) c3).food();
			}
		}
		
		//경험치 증가
		p.setExp(p.getExp()+c3.getExp());
		p.setKinds(c3.getKinds());
		
		//정보확인
		System.out.println(p);	
		
		
		System.out.println(p.getName()+"["+p.getKinds()+"]"+"님께서 조리를 시작했습니다.");
		
		
		
		
		Snack c4 = new Sundae(150,170,"1급조리사");
		c4.cook();
			

		if(c4 instanceof Sundae) {
			((Sundae) c4).reheat();
		}
		
		for(int i = c4.getBun(); i >0; i-=3){
			if(c4 instanceof Sundae ) {
				((Sundae) c4).reheat();
			}
		}
		
		p.setExp(p.getExp()+c4.getExp());
		p.setKinds(c4.getKinds());
		
		
		System.out.println(p);
	
		Snack c5 = new Sundae(170,170,"부조리장");
		c5.cook();
	
	
		if(c5 instanceof Sundae) {
			((Sundae) c5).reheat();
		}
		
		for(int i = c5.getBun(); i >0; i-=3){
			if(c5 instanceof Sundae ) {
				((Sundae) c5).reheat();
			}
		}
		
	
		p.setExp(p.getExp()+c5.getExp());
		p.setKinds(c5.getKinds());
		
		
		System.out.println(p);	
		
		
		
		Snack c6 = new Sundae(200,200,"조리장");
		c6.cook();
		
		
		if(c6 instanceof Sundae) {
			((Sundae) c6).reheat();
		}
		
		for(int i = c6.getBun(); i >0; i-=3){
			if(c6 instanceof Sundae ) {
				((Sundae) c6).reheat();
			}
		}
		

		p.setExp(p.getExp()+c6.getExp());
		p.setKinds(c6.getKinds());
		
	
		System.out.println(p);	
		
		
		Snack c7 = new Fried(250,270,"주방장");
		c7.cook();
			

		if(c7 instanceof Fried) {
			((Fried) c7).timer();
		}
		
		for(int i = c7.getBun(); i >0; i-=3){
			if(c7 instanceof Fried) {
				((Fried) c7).timer();
			}
		}
		
		p.setExp(p.getExp()+c7.getExp());
		p.setKinds(c7.getKinds());
		
		
		System.out.println(p);
	
		Snack c8 = new Fried(270,270,"부총주방장");
		c8.cook();
	
	
		if(c8 instanceof Fried) {
			((Fried) c8).timer();
		}
		
		for(int i = c8.getBun(); i >0; i-=3){
			if(c8 instanceof Fried ) {
				((Fried) c8).timer();
			}
		}
		
	
		p.setExp(p.getExp()+c8.getExp());
		p.setKinds(c8.getKinds());
		
		
		System.out.println(p);	
		
		
		
		Snack c9 = new Fried(250,270,"총주방장");
		c9.cook();
		
		
		if(c9 instanceof Fried) {
			((Fried) c9).timer();
		}
		
		for(int i = c9.getBun(); i >0; i-=3){
			if(c9 instanceof Fried ) {
				((Fried) c9).timer();
			}
		}
		

		p.setExp(p.getExp()+c9.getExp());
		p.setKinds(c9.getKinds());
		
	
		System.out.println(p);	
		
		
		
		
		
	}
	
	
	
}
