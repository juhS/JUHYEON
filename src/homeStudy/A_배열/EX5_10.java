package homeStudy.A_�迭;

import java.util.Scanner;

public class EX5_10 {

	public static void main(String[] args) {

		String[][] words = {
				{ "chair" , "����"},
				{ "computer" , "��ǻ��"},
				{ "integer" ,  "����"}

		};

		Scanner scanner = new Scanner(System.in);



		for(int i = 0; i < words.length; i++) {
								//d : ����, s : ���ڿ�
			System.out.printf("Q%d. %s�� ����? " , i+1 , words[i][0]);

			String tmp = scanner.nextLine();

			if(tmp.equals(words[i][1])) {	//�ٹٲ� == \n
				System.out.printf("�����Դϴ�. %n%n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n", words[i][1]);
			}

		} //for����


	}//main ��
}
