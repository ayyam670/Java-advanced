package day2;

public class CalcTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator(5,6);
		// 원면적
		Calculator cal2 = new Calculator(5);
		
		cal.add();
		System.out.println(cal.result);
		
		cal.mul();
		System.out.println(cal.result);
		
		// 원면적 테스트
		cal2.calArea();
		System.out.println(cal2.getArea());
		
		// 정적메서드 호출(클래스이름으로 접근, 객체 생성안함)
		double result = Calculator.calArea(5);
		System.out.println(result);
		
		
//		System.out.println(cal.add());
//		System.out.println(cal.mul());
	}
	
	
}
