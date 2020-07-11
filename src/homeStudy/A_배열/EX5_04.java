package homeStudy.A_배열;

import java.util.Arrays;

public class EX5_04 {

	public static void main(String[] args) {

	int[] numArr = {0,1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.toString(numArr)); // 저장되어있는 배열의 수
	  
	for(int i = 0; i < numArr.length; i++) {
		int n = (int)(Math.random()*10); // 0~9 중의 한 값을 임의로 얻는다.
		int tmp = numArr[i];
		numArr[i] = numArr[n];
		numArr[n] = tmp;
		System.out.println(Arrays.toString(numArr)); // 임의의 랜덤 배열 수
	}
		

	}

}
