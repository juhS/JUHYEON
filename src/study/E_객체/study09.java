package study.E_��ü;

public class study09 {

	//[��ü- ����]
		// ��Ű�� : study.��ü
	    // Ŭ���� : study.��ü.study_09.java
		//		: study.��ü.study_09Main.java
		// 
		//�ڹ� ���� ��������2 - ��ü ���� �����ϱ�.
		//
		//[����]
		// 2-1) ������ ���� ��������� ���� study09Ŭ������ �����ϼ���.
		//
		// Ÿ��             ������             ����
		// String     name       �л��̸�
		// int        ban        ��
		// int        no         ��ȣ
		// int        kor        ��������
		// int        eng        ��������
		// int        math       ��������
		//
		//2-2) 2-1���� ������ stuty09Ŭ������ ������ ���� ���ǵ� �� ���� �޼��� getTotal()�� getAverage()�� �߰��ϼ���.
		//	1. �޼���� : getTotal
		//
		//	   ��� : ����(kor), ����(eng), ����(math)�� ������ ��� ���ؼ� ��ȯ�Ѵ�.
		//
		//	   ��ȯŸ�� : int
		//
		//	   �Ű����� : ����
		//
		//
		//
		//	2. �޼���� : getAverage
		//
		//	   ��� : ����(��������+��������+��������)�� ������� ���� ����� ���Ѵ�.
		//
		//	           �Ҽ��� ��°�ڸ����� �ݿø��� ��.
		//
		//	   ��ȯŸ�� : float
		//
		//	   �Ű����� : ����
		//
		// [������]
		// �̸� : ȫ�浿
		// ���� : 236
		// ��� : 78.7
		//
		//
		//2-3) ������ ���� ���� ����� �򵵷� studyŬ������ �����ڿ� info�� �߰��ϼ���
		//
	    // [������]
		//	ȫ�浿,1,1,100,60,76,236,78.67
	
	
	
	
	
	

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
