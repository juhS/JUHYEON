package study.������;

import java.util.Scanner;

public class study02 {

// �Ʒ� ������ ����
// Ű����� �Է¹��� ���� �Է¹޾�,
// '�̸�' ��/�� '�������' �� Ÿ�� kh�п����� ���µ� '�ҿ�ð�(��)'���� �ҿ�ȴ�.
// ���� �Է¹��� �ҿ�ð��� 60�� �̻��� ��� 
// '�̸�' �� �������� ȭ����!'�� ��µǰ� �ۼ��ϼ���.
	
	// ���ڿ� - �̸�
	// ���ڿ� - �������
	// ���� - �ҿ�ð�(��)
	
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String trans;
		int bun;
		
		
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.print("�п����� ���� ������� : ");
		trans = sc.next();
		System.out.print("�п����� ���� �ҿ�ð�(��) : ");
		bun = sc.nextInt();
		
		System.out.println(name + "��/�� " + trans + "��/�� Ÿ�� kh�п����� ���µ� " + bun + "���� �ҿ�ȴ�." );
		
		if(bun >=60) {

			System.out.print(name+"�� �������� ȭ����!!");
			
		}
		
	}
	
}
