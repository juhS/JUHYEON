package study.��ü;

public class study10 {
	
			//[��ü- ����]
			// ��Ű�� : study.��ü
		    // Ŭ���� : study.��ü.study_10.java
			//		: study.��ü.study_10Main.java
			// 
			//�ڹ� ���� ��������3 - ��ü �����ϱ�.
			//
			//[����]
			//������ �ڵ带 �������ϸ� ������ �߻��Ѵ�. ������ ������ �߻��ϴ� ���ΰ� �� ������ �����Ͻÿ�.
	
	
	
	
	
	
	
	
	
	
	//[Ǯ��]
	
	int iv = 10;

	static int cv = 20;



	int iv2 = cv;

	static int cv2 = iv; // ���� A



	static void staticMethod1() {

		System.out.println(cv);

		System.out.println(iv); // ���� B

	}



	void instanceMethod1() { 

		System.out.println(cv); 

		System.out.println(iv);  //���� C 

	} 

	

	static void staticMethod2() { 

		staticMethod1(); 

		instanceMethod1();  //���� D 

	} 

	

	void instanceMethod2() { 

		staticMethod1();  //���� E 

		instanceMethod1(); 

	} 
	
	
	
	
	
	
	
//	���� A, ���� B, ���� D
//
//	����A - static ������ �ʱ�ȭ�� �ν��Ͻ������� ����� �� ����.
//
//	�� ����ؾ��Ѵٸ�, ��ü�� �����ؾ��Ѵ�.
//
//	����B - static�޼��忡���� �ν��Ͻ������� ����� �� ����.
//
//	����D - static�޼��忡���� �ν��Ͻ��޼��带 ����� �� ����.



}
	


