package homeStudy.A_�迭;

import java.util.Arrays;

public class EX5_12 {

	public static void main(String[] args) {
		
		int[]arr = {0,1,2,3,4}; //1���� �迭
		int[][]arr2D = {{11,12},{21,22}}; //2���� �迭
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.deepToString(arr2D));
	
	
	String[][] str2D = {{"AAA","BBB"},{"aaa","bbb"}};
	String[][] str2D2 = {{"AAA","BBB"},{"aaa","bbb"}};
	
	
	System.out.println(str2D==str2D2); //�������� �� �� false
	System.out.println(Arrays.deepEquals(str2D, str2D2));
	
	int[] arr2 = Arrays.copyOf(arr, arr.length);
	System.out.println(Arrays.toString(arr2));
	
	int[] arr3 = Arrays.copyOfRange(arr, 2,4);
	System.out.println(Arrays.toString(arr3));
	
	
	
	int[]arr4 = {3,4,0,1,2}; 
	System.out.println(Arrays.toString(arr4)); //������
	
	Arrays.sort(arr4); //�迭 arr�� ������������ ����
	System.out.println(Arrays.toString(arr4)); //������
	
	
	
	
	
	
	
	}

}
