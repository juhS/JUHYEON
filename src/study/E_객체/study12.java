package study.E_객체;


// 패키지 : study.E_객체
// 클래스 : study.E_객체.study_12.java
// 
//자바 정석 연습문제3 - 객체 이해하기

//[문제]
// 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으세요


public class study12 {

	int kind; 
	int num; 

	static int width; 
	static int height; 


	study12(int k, int n) { 

		kind = k; 
		num = n; 

	} 


	public static void main(String args[]) { 

		study12 study = new study12(1,1); 

	} 


}







//[풀이]

//- 클래스변수 (static변수) : width, height
//- 인스턴스변수 : kind, num
//- 지역변수 : k, n, card, args

// 클래스 블럭 내에 선언된 변수는 인스턴스 변수
// static이 붙은 변수는 static변수(클래스 변수)이며, 나머지는 모두 지역변수이다.





