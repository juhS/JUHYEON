package study.배열;

import java.util.Scanner;

public class study_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//1)
		//[배열]
		// 패키지 : study.배열
		// 실행용클래스,기능제공용 클래스 : study.배열.study_04.java
		//
		//
		
		//[문제]
		//양의 정수 10개를 입력받아 배열에 저장하고,
		//배열에 있는 정수 중 3의 배수만 출력하세요.
		//
		//[출력]
//		정수 10개를 입력하세요 : 
//		1
//		3
//		5
//		4
//		62
//		8
//		2
//		3
//		1
//		2
//		입력받은 정수의 3의 배수는 : 
//		3
//		3

		
		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요 : ");
		int[]arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	  //3의 배수
		System.out.println("입력받은 정수의 3의 배수는 : ");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%3 == 0) {
				System.out.println(arr[i] + "");
			}
		}
		
		
	}

}
