package study.E_객체;

public class study09 {

	//[객체- 자율]
		// 패키지 : study.객체
	    // 클래스 : study.객체.study_09.java
		//		: study.객체.study_09Main.java
		// 
		//자바 정석 연습문제2 - 객체 순서 이해하기.
		//
		//[문제]
		// 2-1) 다음과 같은 멤버변수를 갖는 study09클래스를 정의하세요.
		//
		// 타입             변수명             설명
		// String     name       학생이름
		// int        ban        반
		// int        no         번호
		// int        kor        국어점수
		// int        eng        영어점수
		// int        math       수학점수
		//
		//2-2) 2-1에서 정의한 stuty09클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하세요.
		//	1. 메서드명 : getTotal
		//
		//	   기능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
		//
		//	   반환타입 : int
		//
		//	   매개변수 : 없음
		//
		//
		//
		//	2. 메서드명 : getAverage
		//
		//	   기능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
		//
		//	           소수점 둘째자리에서 반올림할 것.
		//
		//	   반환타입 : float
		//
		//	   매개변수 : 없음
		//
		// [실행결과]
		// 이름 : 홍길동
		// 총점 : 236
		// 평균 : 78.7
		//
		//
		//2-3) 다음과 같은 실행 결과를 얻도록 study클래스에 생성자와 info를 추가하세요
		//
	    // [실행결과]
		//	홍길동,1,1,100,60,76,236,78.67
	
	
	
	
	
	

	String name;

	int ban;

	int no;

	int kor;

	int eng;

	int math;
	
	
	
	
	public int getTotal() {

		return kor + eng + math;

	}



	public float getAverage(){

		return  Math.round(getTotal() / 3f * 100)/100f;

	}
	
	
	public study09(String name, int ban, int no, int kor, int eng, int math) {

		super();

		this.name = name;

		this.ban = ban;

		this.no = no;

		this.kor = kor;

		this.eng = eng;

		this.math = math;

	}



	public String info() {

		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math+ "," + getTotal() + "," + getAverage();

	}
	
	
	
	
}
