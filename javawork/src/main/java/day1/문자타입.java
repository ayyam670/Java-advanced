package day1;

public class 문자타입 {

	public static void main(String[] args) {
		
		char c1 = 'A';           //== int
		
		int c2 = 'a' -32;
		
		System.out.println("c1 : " +c1);
		System.out.println("c1 : " + (int)c1);     // 형변환 == 캐스트연산자
		
		System.out.println("c2 : " + c2);
		System.out.println("c2 : " +(char)c2);
	}
}
