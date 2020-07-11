package homeStudy.A_배열;

import java.util.Arrays;

public class EX5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int[] score;  //1. 배열 score를 선언(참조변수)
		//		score = new int[5];  //2.배열의 생성(int  저장공간 x 5)

		//		int[] score = new int[5]; // 배열의 선언과 생성을 동시에
		//		score[3] = 100;
		//		
		//		System.out.println("score [0] = " + score[0]);
		//		System.out.println("score [1] = " + score[1]);
		//		System.out.println("score [2] = " + score[2]);
		//		System.out.println("score [3] = " + score[3]);
		//		System.out.println("score [4] = " + score[4]);
		//
		//		
		//		int value = 100;
		//		System.out.println("value = " + value);
		//------------------------------		

		//index범위 : 0~9
		/*int[]arr = new int[9]; //길이가 5->9인 int 배열 arr을 생성
		System.out.println("arr.length = " + arr.length);*/

		/*for(int i = 0 ; i < 10 ; i++) { // index범위를 벗어나서 에러
			System.out.println("arr[" + i + "] =" + arr[i]);
		}*/

		/*for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr[" + i + "] =" + arr[i]);
		}*/
		//----------------------------------		

		System.out.println("iArr1");

		int[] iArr1 = new int[10];

		char[] chArr = {'a','b','c','d'};

		for(int i=0 ; i < iArr1.length;i++) {
			iArr1[i] = i + 1 ;
		}
		//배열에 저장된 값들을 출력
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+ " , ");
		}
		System.out.println();



		//-------------------------------

		System.out.println("iArr2");

		int[] iArr2 = new int[10];

		for(int i=0 ; i < iArr2.length;i++) {
			iArr2[i] = (int)(Math.random()*10)+1;		}
		
		
		//----------------------------------
		System.out.println("iArr3");
		
		int[] iArr3 = {100,95,80,70,60};
		System.out.println(iArr3);
		
		for(int i = 0; i<iArr3.length; i++){
			System.out.println(iArr3[i]);
		}
		
		//System.out.println();
		
		System.out.print(Arrays.toString(iArr3));
		
		System.out.println();
	
	//---------------------------
		System.out.println("출력");
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(iArr3);
		
		
		
	
	
	}


	//		


}
