package homeStudy.A_�迭;

public class EX5_02 {

	public static void main(String[] args) {

		int sum = 0; //������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����
		
		int[] score = {100,88,100,100,90};
		
	/*	sum += score[0];
		sum += score[1];
		sum += score[2];
		sum += score[3];
		sum += score[4];*/
		
		
		for(int i= 0 ; i < score.length ; i++) {
			sum += score[i];
		}
		
		//average = sum / score.length;
		average = sum / (float)score.length; // ������� float�� ��� ���� ����ȯ
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
		

	}

}
