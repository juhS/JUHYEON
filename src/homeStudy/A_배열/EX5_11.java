package homeStudy.A_배열;

import java.util.Scanner;

public class EX5_11 {

	public static void main(String[] args) {
		
		//-> 문자 한개 뽑을때
		//			  01234
		String str = "ABCDE"; // str.lengh()는 5
		char ch = str.charAt(3);
		System.out.println(ch);

		String str2 = str.substring(1,4); //BCD
		System.out.println(str2);

		String str3 = str.substring(1); //1~4
		System.out.println(str3);
		
		String str4 = str.substring(1,str.length()); //CD
		System.out.println(str4); 
	}
}
