package study.���;

import java.util.Scanner;

public class study_03 {
	
	
	//[���]
	// ��Ű�� : study.���
	// �����Ŭ����,��������� Ŭ���� : study.���.study_03.java
	//
	//
	//[����]
	//������ �Է� �޾�, �� ���� ��� �ϋ�, �������� ��µǰ� �ϼ���.
	//��, ����� �ƴ� ��� ����� �ƴմϴ�. ���
	//
	//����
	// �ܼ� : 2
	// 2 * 1 = 2
	// 2 * 2 = 4
	// 2 * 3 = 6
	//  ...
	// 2 * 9 = 18
	//------
	//���� �Է� : -1
	//����� �ƴմϴ�. �ٽ� �Է��ϼ���.
	
	


	public static void main(String[] args) {
		//1)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է�");
		System.out.print("������ �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <10) {
			for(int i = 1; i <10 ; i++ ) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			
		}else {
			System.out.println("����� �ƴմϴ�. �ٽ� �Է��ϼ���."); 
		}
			
	}

}
