package study.E_��ü;


//��Ű�� : study.E_��ü
//Ŭ���� : study.E_��ü.study_013.java
//
//�ڹ� ���� ��������3 - ��ü �����ϱ�

//[����]
//������ ��ǻ�� ������ ����(study13marine)�� Ŭ������ ������ ���̴�. 
//�� Ŭ������ ��� �߿� static�� �ٿ��� �ϴ� ���� � �͵��̰� �� ������ �����ΰ�? 
//(��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.)



public class study13marine {


	int x=0, y=0; //Marine�� ��ġ��ǥ (x,y) 
	
	int hp = 60; //���� ü�� 

	int weapon = 6; //���ݷ� 

	int armor = 0; //����



	void weaponUp() { 
		weapon++; 
	} 

	void armorUp() { 
		armor++; 
	} 

	void move(int x, int y) { 
		this.x = x; 

		this.y = y; 

	} 

}







//[Ǯ��]
// weapon, armor ; ��� ������ ���ݷ°� ������ ���ƾ� �ϱ� ������ ������ �����ϵ��� static�� �ٿ��� �Ѵ�.
//
//	+ weaponUp(), armorUp() -> static������ ���� �۾��� �ϴ� �޼����̹Ƿ�..
		


