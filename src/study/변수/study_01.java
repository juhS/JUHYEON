package study.변수;

import java.util.Scanner;

public class study_01 {
	
	//형변환 관련.
	//네과목(국,영,수,과)점수를 실수형으로 입력 받은 후, 
	// 네과목의 평균을 정수형으로 출력하게 하세요.

	
	public void example1() {
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		System.out.print("과학 : ");
		double d = sc.nextDouble();
		
		int total = (int)a + (int)b+ (int)c+ (int)d;
		int ave = total/4;
		
		System.out.println("네과목 평균 : " + ave);
		
	
	}
	

}



/*	int kor = (int)a;
		int eng = (int)b;
		int math = (int)c;
		int sci = (int)d;
	
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + kor);
		System.out.println("수어 : " + kor);
		System.out.println("과학 : " + kor);*/