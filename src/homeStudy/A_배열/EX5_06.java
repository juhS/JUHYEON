package homeStudy.A_�迭;

import java.util.Arrays;

public class EX5_06 {

	public static void main(String[] args) {

	//index : 0~3-1 -> 0~2
		
		String[] strArr = {"����","����","��"};
		System.out.println(Arrays.toString(strArr));
		
		System.out.println("<0~2 ���Ȯ��>");
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println((int)(Math.random()*3)); //0~2
			}
		
		
		System.out.println("<������ ��� : 0~2 ���Ȯ��>");
		//������ ���(0~2)
		for(int i = 0 ; i < 10 ; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(tmp);// 0~2
		}
		
		
		System.out.println("<���ڷ� ��� (0~2->����������)>");
		//���ڷ� ���(0~2 -> ����������)
		for(int i = 0 ; i < 10 ; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]);// 0~2
		}
		
		
		
		
		

	}

}
