package study.�迭;

public class study05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
				//[2�����迭]
				// ��Ű�� : study.�迭
				// �����Ŭ����,��������� Ŭ���� : study.�迭.study_05.java
				//
				//
				
				//[����]
				//3*3 �迭�� ������ ��,
				//1���� 9���� ����غ�����.
				//
				//[���]
				//	1 2 3 
				//	4 5 6 
				//	7 8 9 
		
		
		
		
		
		
		

		int[][] arr = new int [3][3]; //3*3�迭 ����
		int num = 1; 
		for(int i =0; i<arr.length;i++) { //�迭 arr���� ���̸�ŭ �ݺ�
			for(int j=0; j<arr[0].length;j++) { //�迭 arr[0]�� ���� ���̸�ŭ �ݺ�
				arr[i][j] = num;
				System.out.print(arr[i][j] + " ");
				num++;
				
			}
			System.out.println();//�ٹٲٱ�
		}
		
		
		
		
	}

}
