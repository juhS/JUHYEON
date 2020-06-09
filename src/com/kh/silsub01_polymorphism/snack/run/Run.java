package com.kh.silsub01_polymorphism.snack.run;

import java.util.Scanner;

import com.kh.silsub01_polymorphism.snack.controller.PlayerManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayerManager pm = new PlayerManager();
		
		System.out.print("아이디 입력 : ");
		String name = sc.nextLine();
		
		pm.starPlay(name);

	}

}
