package study.C_제어문;

import java.util.Scanner;

public class study03 {
	
	//1)
	//[제어문]
	// 패키지 : study.제어문
	// 실행용클래스,기능제공용 클래스 : study.제어문.study03.java
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
	
	
	
	
	//2) +@
	//[제어문]
	// 패키지 : study.제어문
	// 실행용클래스,기능제공용 클래스 : study.제어문.study03.java
	//
	//
	//[문제]
	//정수를 입력 받아, 입력받은 숫자까지의 단 출력(제한 구구단 / 2~9단 출력).
	// -출력예시
	// 몇단까지 출력하시겠습니까? : 5
	// 2단 : 2*1=2, 2*2=4 ... 2*9=18
	// 3단 : ...
	// 4단 : ...
	// 5단 : 5*1=5, 5*2=10, ... 5*9=45

	
	
	
	
	
	public void gugudan() {
		//1)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 입력");
		System.out.print("정수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan >= 1 && dan <10) {
			for(int i = 1; i <10 ; i++ ) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			
		}else {
			System.out.println("양수가 아닙니다. 다시 입력하세요."); 
		}
			
	}
	
	public void gugudan2() {
		//2)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇단까지 출력하시겠습니까? : ");
		int dan = sc.nextInt();
		
		for(int i = 2 ; i <= dan; i++) { //단수 출력
			System.out.println(i + "단");
			
			for(int su = 1; su <10 ; su++) { //수 출력
				if(su == 9) { // , 빼고 출력하기
					System.out.print(i + " * " + su + " = " + (i*su));
				}else {
					System.out.print(i + " * " + su + " = " + (i*su) + ", " );
				}
			}
			System.out.println(); // 단 끝나면(su가 9까지 출력되면) 줄바꾸기.
		}
		
		
		
		
	}
		
	

	public static void main(String[] args) {
		study03 a = new study03();
		a.gugudan();
		//a.gugudan2();
		
	}
}
