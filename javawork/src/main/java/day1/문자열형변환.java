package day1;


/*
 *  래퍼클래스
 *  char        int       long   float   double   <- 8
 *  Character   Integer   Long   Float
 *  1. 객체화 -> null값 가능 (Integer는 가능 int는 불가능) 파라미터   ?age= --> int 는 오류, Integer age 는 가능
 *  2. 형변환
 *  3. 박싱/언박싱
 */

public class 문자열형변환 {

	public static void main(String[] args) {
		
		// String - > int
		String strAge = "20";
		int age = Integer.parseInt(strAge);
		
		System.out.println(strAge);
		System.out.println(age-1);
		
		// int -> String
		strAge = Integer.toString(age);
		
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
		
	}
}
