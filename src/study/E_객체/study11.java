package study.E_��ü;

public class study11 {

	//[��ü- ����]
	// ��Ű�� : study.��ü
	// Ŭ���� : study.��ü.study_10.java
	//		: study.��ü.study_10Main.java
	// 
	//�ڹ� ���� ��������3 - ��ü �����ϱ�.
	//
	//[����]
	//������ �ڵ带 �������ϸ� ������ �߻��Ѵ�. ������ ������ �߻��ϴ� ���ΰ� �� ������ �����Ͻÿ�.



	public static void change(String str) {

		str += "456";

	}



	public static void main(String[] args) {

		String str = "ABC123";

		System.out.println(str);

		change(str);

		System.out.println("After change:" + str);

	}

}






//[Ǯ��]
// -���-
//ABC123
//After change: ABC123
//�ؼ� : str�� change�޼����� ���������̹Ƿ� change�޼��尡 ����Ǹ� str���� �޸𸮿��� ���ŵȴ�. 






