package study.제어문;

import java.util.Scanner;

public class study_03 {
	
	
	//[제어문]
	// 패키지 : study.제어문
	// 실행용클래스,기능제공용 클래스 : study.제어문.study_03.java
	//
	//
	//[문제]
	//정수를 입력 받아, 그 수가 양수 일떄, 구구단이 출력되게 하세요.
	//단, 양수가 아닐 경우 양수가 아닙니다. 출력
	//
	//예시
	// 단수 : 2
	// 2 * 1 = 2
	// 2 * 2 = 4
	// 2 * 3 = 6
	//  ...
	// 2 * 9 = 18
	//------
	//정수 입력 : -1
	//양수가 아닙니다. 다시 입력하세요.
	
	


	public static void main(String[] args) {
		//1)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 입력");
		System.out.print("정수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <10) {
			for(int i = 1; i <10 ; i++ ) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			
		}else {
			System.out.println("양수가 아닙니다. 다시 입력하세요."); 
		}
			
	}

}
