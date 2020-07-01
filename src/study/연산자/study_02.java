package study.연산자;

import java.util.Scanner;

public class study_02 {

// 아래 내용을 선언
// 키보드로 입력받은 값을 입력받아,
// '이름' 은/는 '교통수단' 을 타고 kh학원까지 오는데 '소요시간(분)'분이 소요된다.
// 만약 입력받은 소요시간이 60분 이상일 경우 
// '이름' 님 힘내세요 화이팅!'이 출력되게 작성하세요.
	
	// 문자열 - 이름
	// 문자열 - 교통수단
	// 정수 - 소요시간(분)
	
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String trans;
		int bun;
		
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("학원까지 오는 교통수단 : ");
		trans = sc.next();
		System.out.print("학원까지 오는 소요시간(분) : ");
		bun = sc.nextInt();
		
		System.out.println(name + "은/는 " + trans + "을/를 타고 kh학원까지 오는데 " + bun + "분이 소요된다." );
		
		if(bun >=60) {

			System.out.print(name+"님 힘내세요 화이팅!!");
			
		}
		
	}
	
}
