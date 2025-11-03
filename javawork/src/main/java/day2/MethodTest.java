package day2;

public class MethodTest {

	public static void main(String[] args) {
		printString("menu");
		printString("food");
	
		sum(5,4);     // 매개변수가 있는 메서드 리턴 x
		int mulNum = mul(5,4); // 매개변수 O 리턴 O 
		
		total(2,3,4,10);
		total(2,3,4);
		total(2,3,4,10,12,15);
		System.out.println(total(2,3,4,10));
	}
	
	static void sum (int num1, int num2) {
		// 두 수의 합을 출력
		int result = num1 + num2;
		
		System.out.println("두 수의 합: " + result);
		return;
	}
	
	static int mul(int num1, int num2) {
		// 두 수의 곱을 출력
		int result = num1 * num2;
		
		return result;
	}
	
	static int total(int ... score) {
		// score = 배열
		
		int result = 1;
		
		for(int value : score) {
			// 합계 계산
			result *= value;
			
		}
		return result;
	}
	
	
	// 중복되는 코드=> 메서드
	static void printHead(){
		System.out.println("============");
		System.out.println("===header===");
		System.out.println("============");
	}
	
	static void printFooter() {
		System.out.println("============");
		System.out.println("===footer===");
		System.out.println("============");
	}
	
	static void printString(String str){
		System.out.println("============");
		System.out.println("===" + str + "===");
		System.out.println("============");
		
//		return;  생략
	}
}
