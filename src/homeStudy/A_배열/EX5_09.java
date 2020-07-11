package homeStudy.A_배열;

public class EX5_09 {

	public static void main(String[] args) {

	int[][] score = {
						{ 100 , 100, 100},
						{  20 ,  20,  20},
						{  30 ,  30,  30},
						{  40 ,  40,  40},
						{  50 ,  50,  50}
					};
	
	//과목별 총점
	int korTotal = 0, engTotal = 0, mathTotal = 0;
	
	
	System.out.println("번호   국어   영어   수학   총점   평균");
	System.out.println("==========================");
						
	for(int i = 0; i < score.length; i++) {
							
		int sum = 0;      //개인별 총점
		float avg = 0.0f; //개인별 평균
			
			korTotal  += score[i][0];
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d" , i + 1);
			
			//행의 길이 ==> score.lengh
			//열의 길이 ==> score[i].length
			
			
			
			for(int j = 0 ; j < score[i].length; i++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
		}
								//열의 길이
			avg = sum / (float)score[i].length;  //평균
			
	}
		
		
		
		

	}

}
