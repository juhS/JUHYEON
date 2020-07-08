package study.객체;

public class study08 {

	//[객체- 자율]
	// 패키지 : study.객체
	// 클래스 : study.객체.study_08.java
	//		: study.객체.study_08Main.java
	// 
	//자바 정석 연습문제 - 객체 순서 이해하기.
	//
	//[문제]
	// 1-1) 다음과 같은 멤버변수를 갖는 study08 클래스를 정의하세요 
	// num : int, isKwang : boolean    -> 카드의 숫자(1~10사이의 정수), 광이면 true/아니면 false
	// 
	// 1-2) 1-1에서 정의한 study08 클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻으세요.
	//  -실행결과   
	//	package study.객체;
	//
	//	public class study08Main {
	//
	//		public static void main(String[] args) {
	//			// TODO Auto-generated method stub
	//			
	//			study08 card1 = new study08(3, false);
	//			study08 card2 = new study08();
	//			System.out.println(card1.info());
	//			System.out.println(card2.info());
	//		}
	//	}


	int num;

	boolean isKwang;


	public study08(){

		this(1, true); //study08를 호출한다.

	}



	public  study08(int num, boolean isKwang){

		this.num = num;

		this.isKwang = isKwang;

	}



	public String info(){

		return num + (isKwang ? "K" : "");

	}
}
