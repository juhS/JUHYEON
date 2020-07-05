package study.객체;

public class study06 {

	//[객체문제]
	//오류가 나는 부분과, 해결방안을 설명하세요.

//	class Test{
//		private String name;
//	}
//	public class Emample{
//		public static void main(String[]args) {
//			Test t = new Test();
//			t.name = "객체";
//		}
//	}

	
	
	
	
	
	
	
	
	
//[답]
	
	
	
	
//private int name; -> 컴파일 오류
//--> name이 private로 되어있어 Test밖에서 접근 불가
//public 속성으로 setter, getter 메소드를 만들어 접근해줘야함.
	
//	public class Test{
//		private String name;
//		
//		public String getName() {
//			return name;
//		}
//		
//		public void setName(String name) {
//			this.name = name;
//		}
//		public class Emample{
//			public static void main(String[]args) {
//				Test t = new Test();
//				t.setName("객체");
//				System.out.println("Test의 이름은? : " + t.getName());
//			}
//		}
//	}

}
