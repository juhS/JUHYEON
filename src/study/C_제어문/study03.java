package study.C_���;

import java.util.Scanner;

public class study03 {
	
	//1)
	//[���]
	// ��Ű�� : study.���
	// �����Ŭ����,��������� Ŭ���� : study.���.study03.java
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
	
	
	
	
	//2) +@
	//[���]
	// ��Ű�� : study.���
	// �����Ŭ����,��������� Ŭ���� : study.���.study03.java
	//
	//
	//[����]
	//������ �Է� �޾�, �Է¹��� ���ڱ����� �� ���(���� ������ / 2~9�� ���).
	// -��¿���
	// ��ܱ��� ����Ͻðڽ��ϱ�? : 5
	// 2�� : 2*1=2, 2*2=4 ... 2*9=18
	// 3�� : ...
	// 4�� : ...
	// 5�� : 5*1=5, 5*2=10, ... 5*9=45

	
	
	
	
	
	public void gugudan() {
		//1)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է�");
		System.out.print("������ �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		if(dan >= 1 && dan <10) {
			for(int i = 1; i <10 ; i++ ) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			
		}else {
			System.out.println("����� �ƴմϴ�. �ٽ� �Է��ϼ���."); 
		}
			
	}
	
	public void gugudan2() {
		//2)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ܱ��� ����Ͻðڽ��ϱ�? : ");
		int dan = sc.nextInt();
		
		for(int i = 2 ; i <= dan; i++) { //�ܼ� ���
			System.out.println(i + "��");
			
			for(int su = 1; su <10 ; su++) { //�� ���
				if(su == 9) { // , ���� ����ϱ�
					System.out.print(i + " * " + su + " = " + (i*su));
				}else {
					System.out.print(i + " * " + su + " = " + (i*su) + ", " );
				}
			}
			System.out.println(); // �� ������(su�� 9���� ��µǸ�) �ٹٲٱ�.
		}
		
		
		
		
	}
		
	

	public static void main(String[] args) {
		study03 a = new study03();
		a.gugudan();
		//a.gugudan2();
		
	}
}
