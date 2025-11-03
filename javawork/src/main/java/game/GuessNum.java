package game;

import java.util.Scanner;

public class GuessNum {

	public void start() {
		Scanner sc = new Scanner(System.in);
		int com = (int) (Math.random() * 100 + 1);
		int user = 0;
		String restart;

		while (true) {
			int cnt = 0;
			
			while (true) {

				// 메뉴출력
				System.out.println("1~100사이 숫자맞추기 게임 시작");

				// 사용자 값을 입력
				user = sc.nextInt();

				// 입력 범위 벗어남
				if (user < 0 && user > 100) {
					System.out.println("입력범위를 벗어났습니다.");
					continue;
				}

				// 입력값과 랜덤값 비교
				if (user > com) {
					System.out.println("사용자 : " + user + "DOWN");
					cnt++;
				} else if (user < com) {
					System.out.println("사용자 : " + user + "UP");
					cnt++;
				} else if (user == com) {
					System.out.println("사용자 : " + user + "정답입니다!");
					cnt++;
					break;
				}

				// 현재 전적 출력
				System.out.println("현재 시도횟수 : " + cnt);
			}

			System.out.println("전체 시도횟수 : " + cnt);
			
			System.out.println("재시작 하시려면 '재시작'을 입력해주세요.");
			
			restart = sc.next();
			
			if(restart.equals("재시작")) {
				continue;
			}else {
				break;
			}
		}
	}
}
