package homeStudy.A_배열;

import java.util.Arrays;

public class EX5_06 {

	public static void main(String[] args) {

	//index : 0~3-1 -> 0~2
		
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		System.out.println("<0~2 출력확인>");
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println((int)(Math.random()*3)); //0~2
			}
		
		
		System.out.println("<변수에 담기 : 0~2 출력확인>");
		//변수에 담기(0~2)
		for(int i = 0 ; i < 10 ; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(tmp);// 0~2
		}
		
		
		System.out.println("<문자로 출력 (0~2->가위바위보)>");
		//문자로 출력(0~2 -> 가위바위보)
		for(int i = 0 ; i < 10 ; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]);// 0~2
		}
		
		
		
		
		

	}

}
