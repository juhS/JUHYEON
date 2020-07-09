package study.객체;

public class study10 {
	
			//[객체- 자율]
			// 패키지 : study.객체
		    // 클래스 : study.객체.study_10.java
			//		: study.객체.study_10Main.java
			// 
			//자바 정석 연습문제3 - 객체 이해하기.
			//
			//[문제]
			//다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
	
	
	
	
	
	
	
	
	
	
	//[풀이]
	
	int iv = 10;

	static int cv = 20;



	int iv2 = cv;

	static int cv2 = iv; // 라인 A



	static void staticMethod1() {

		System.out.println(cv);

		System.out.println(iv); // 라인 B

	}



	void instanceMethod1() { 

		System.out.println(cv); 

		System.out.println(iv);  //라인 C 

	} 

	

	static void staticMethod2() { 

		staticMethod1(); 

		instanceMethod1();  //라인 D 

	} 

	

	void instanceMethod2() { 

		staticMethod1();  //라인 E 

		instanceMethod1(); 

	} 
	
	
	
	
	
	
	
//	라인 A, 라인 B, 라인 D
//
//	라인A - static 변수의 초기화에 인스턴스변수를 사용할 수 없다.
//
//	꼭 사용해야한다면, 객체를 생성해야한다.
//
//	라인B - static메서드에서는 인스턴스변수를 사용할 수 없다.
//
//	라인D - static메서드에서는 인스턴스메서드를 사용할 수 없다.



}
	


