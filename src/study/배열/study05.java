package study.배열;

public class study05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
				//[2차원배열]
				// 패키지 : study.배열
				// 실행용클래스,기능제공용 클래스 : study.배열.study_05.java
				//
				//
				
				//[문제]
				//3*3 배열을 선언한 후,
				//1부터 9까지 출력해보세요.
				//
				//[출력]
				//	1 2 3 
				//	4 5 6 
				//	7 8 9 
		
		
		
		
		
		
		

		int[][] arr = new int [3][3]; //3*3배열 선언
		int num = 1; 
		for(int i =0; i<arr.length;i++) { //배열 arr행의 길이만큼 반복
			for(int j=0; j<arr[0].length;j++) { //배열 arr[0]의 열의 길이만큼 반복
				arr[i][j] = num;
				System.out.print(arr[i][j] + " ");
				num++;
				
			}
			System.out.println();//줄바꾸기
		}
		
		
		
		
	}

}
