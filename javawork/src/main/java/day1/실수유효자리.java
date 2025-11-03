package day1;

public class 실수유효자리 {
	
	public static void main(String[] args) {
		
//		double a = 1.2f;               // double이 float를 포함 할 수 있어서 형변환 없어도됨
		
		// float형
		float f = (float)0.1234567890123;           // 유효자릿수 7자리 - 7자리 이후는 출력 안됨 출력값 = 0.12345679
//		float f = 0.1234567890123f;                 // (float) 또는 끝에 f == 형변환
		System.out.println(f);
		
		// double형
		double d = 0.1234567890123456789; // 유효자릿수 15자리
		System.out.println(d);
	}
}
