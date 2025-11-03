package day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 요구사항 :
 *  1. 난수 6개 생성해서 리스트에 저장
 *  2. 1 ~ 15
 *  3. 중복값 허용 안됨
 */
public class 로또번호 {

	public static void main(String[] args) {
		// 리스트 변수 선언 ==> 중복값 제거하려면 Set을 이용
		Set<Integer> list = new HashSet<>();
		int num = 0;
		
		
		// while(list.size() < 6 )
		while(list.size() < 6) {
			
			
			// 난수생성(1 ~ 20)
			num = (int)(Math.random() * 44 + 1);
		
			// 리스트에 추가 ( add() )
			list.add(num);
		
		}
		// 결과출력
		System.out.println(list);
	}
}
