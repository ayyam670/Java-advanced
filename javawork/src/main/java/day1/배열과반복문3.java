package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과반복문3 {

	public static void main(String[] args) {
		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(5);
		score.add(4);
		score.add(3);
		score.add(2);
		score.add(1);
		
		
//		List<Integer> list2 = (List<Integer>)Arrays.asList(4,5,3,2,6);
		
		int cnt = 0;

		// 성적을 출력
		for (int i = 0; i < score.size(); i++) {
			System.out.print(score.get(i));

			// 통과여부 3점이상이면 success / fail
			if (score.get(i) >= 3) {
				cnt++;
				System.out.println("success");
			} else {
				System.out.println("fail");
			}

		}
		// 통과된 건수 출력
		System.out.println("통과된 건수 : " + cnt);
		
		
	}
}
