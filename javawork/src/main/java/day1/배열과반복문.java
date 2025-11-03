package day1;

public class 배열과반복문 {

	public static void main(String[] args) {
		// 성적 5개
		int[] score = { 5, 4, 3, 6, 2 };
		int cnt = 0;

		// 성적을 출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]);

			// 통과여부 3점이상이면 success / fail
			if (score[i] >= 3) {
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
