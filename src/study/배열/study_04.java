package study.�迭;

import java.util.Scanner;

public class study_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//1)
		//[�迭]
		// ��Ű�� : study.�迭
		// �����Ŭ����,��������� Ŭ���� : study.�迭.study_04.java
		//
		//
		
		//[����]
		//���� ���� 10���� �Է¹޾� �迭�� �����ϰ�,
		//�迭�� �ִ� ���� �� 3�� ����� ����ϼ���.
		//
		//[���]
//		���� 10���� �Է��ϼ��� : 
//		1
//		3
//		5
//		4
//		62
//		8
//		2
//		3
//		1
//		2
//		�Է¹��� ������ 3�� ����� : 
//		3
//		3

		
		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 10���� �Է��ϼ��� : ");
		int[]arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	  //3�� ���
		System.out.println("�Է¹��� ������ 3�� ����� : ");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]%3 == 0) {
				System.out.println(arr[i] + "");
			}
		}
		
		
	}

}
