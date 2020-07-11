package homeStudy.A_배열;

import java.util.Arrays;

public class EX5_12 {

	public static void main(String[] args) {
		
		int[]arr = {0,1,2,3,4}; //1차원 배열
		int[][]arr2D = {{11,12},{21,22}}; //2차원 배열
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.deepToString(arr2D));
	
	
	String[][] str2D = {{"AAA","BBB"},{"aaa","bbb"}};
	String[][] str2D2 = {{"AAA","BBB"},{"aaa","bbb"}};
	
	
	System.out.println(str2D==str2D2); //참조변수 값 비교 false
	System.out.println(Arrays.deepEquals(str2D, str2D2));
	
	int[] arr2 = Arrays.copyOf(arr, arr.length);
	System.out.println(Arrays.toString(arr2));
	
	int[] arr3 = Arrays.copyOfRange(arr, 2,4);
	System.out.println(Arrays.toString(arr3));
	
	
	
	int[]arr4 = {3,4,0,1,2}; 
	System.out.println(Arrays.toString(arr4)); //정렬전
	
	Arrays.sort(arr4); //배열 arr을 오름차순으로 정렬
	System.out.println(Arrays.toString(arr4)); //정렬후
	
	
	
	
	
	
	
	}

}
