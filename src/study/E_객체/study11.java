package study.E_객체;

public class study11 {

	//[객체- 자율]
	// 패키지 : study.객체
	// 클래스 : study.객체.study_10.java
	//		: study.객체.study_10Main.java
	// 
	//자바 정석 연습문제3 - 객체 이해하기.
	//
	//[문제]
	//다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.



	public static void change(String str) {

		str += "456";

	}



	public static void main(String[] args) {

		String str = "ABC123";

		System.out.println(str);

		change(str);

		System.out.println("After change:" + str);

	}

}






//[풀이]
// -출력-
//ABC123
//After change: ABC123
//해설 : str은 change메서드의 지역변수이므로 change메서드가 종료되면 str역시 메모리에서 제거된다. 






