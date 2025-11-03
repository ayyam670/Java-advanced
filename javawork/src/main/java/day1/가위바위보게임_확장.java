package day1;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임_확장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = 0;
		int com = 0;
		Random random = new Random();
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		// 반복문
		while(true) {
			
			// 메뉴출력
			System.out.println("가위(1), 바위(2), 보(3), 종료(0)");
			
			// 사용자 값을 입력
			user = sc.nextInt();
			
			// 0 이면 종료
			if(user == 0) break;
			
			// 1~3이 아니면 다시 입력
			if(user > 3) continue;
			
			// 컴퓨터 선택 생성
			com = random.nextInt(3) + 1;
			// com = (int)Math.random()*3+1;
			
			// 사용자와 컴퓨터 선택 출력
			System.out.println("사용자 : " + user + "컴퓨터 : " + com);
			
			// 승패 판정 로직
			if(user == com) {
				System.out.println("무승부입니다.");
				draw ++;
			}else if(user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
				System.out.println("사용자 승리!");
				win ++;
			}else {
				System.out.println("사용자 패배!");
				lose ++;
			}
			
			// 현재 전적 출력
			System.out.println("현재 전적 - 승: " + win + " 패: " + lose + " 무승부: " + draw);
		}
		// 최종 결과 출력
		System.out.println("최종 전적 - 승 : " + win + " 패 : " + lose + " 무승부 : " + draw);
		
		sc.close();
	}
}
