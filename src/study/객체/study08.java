package study.��ü;

public class study08 {

	//[��ü- ����]
	// ��Ű�� : study.��ü
	// Ŭ���� : study.��ü.study_08.java
	//		: study.��ü.study_08Main.java
	// 
	//�ڹ� ���� �������� - ��ü ���� �����ϱ�.
	//
	//[����]
	// 1-1) ������ ���� ��������� ���� study08 Ŭ������ �����ϼ��� 
	// num : int, isKwang : boolean    -> ī���� ����(1~10������ ����), ���̸� true/�ƴϸ� false
	// 
	// 1-2) 1-1���� ������ study08 Ŭ������ �� ���� �����ڿ� info()�� �߰��ؼ� �������� ���� ����� ��������.
	//  -������   
	//	package study.��ü;
	//
	//	public class study08Main {
	//
	//		public static void main(String[] args) {
	//			// TODO Auto-generated method stub
	//			
	//			study08 card1 = new study08(3, false);
	//			study08 card2 = new study08();
	//			System.out.println(card1.info());
	//			System.out.println(card2.info());
	//		}
	//	}


	int num;

	boolean isKwang;


	public study08(){

		this(1, true); //study08�� ȣ���Ѵ�.

	}



	public  study08(int num, boolean isKwang){

		this.num = num;

		this.isKwang = isKwang;

	}



	public String info(){

		return num + (isKwang ? "K" : "");

	}
}
