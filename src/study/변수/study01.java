package study.����;

import java.util.Scanner;

public class study01 {
	
	//����ȯ ����.
	//�װ���(��,��,��,��)������ �Ǽ������� �Է� ���� ��, 
	// �װ����� ����� ���������� ����ϰ� �ϼ���.

	
	public void example1() {
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� : ");
		double a = sc.nextDouble();
		System.out.print("���� : ");
		double b = sc.nextDouble();
		System.out.print("���� : ");
		double c = sc.nextDouble();
		System.out.print("���� : ");
		double d = sc.nextDouble();
		
		int total = (int)a + (int)b+ (int)c+ (int)d;
		int ave = total/4;
		
		System.out.println("�װ��� ��� : " + ave);
		
	
	}
	

}



/*	int kor = (int)a;
		int eng = (int)b;
		int math = (int)c;
		int sci = (int)d;
	
		
		System.out.println("���� : " + kor);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + kor);*/