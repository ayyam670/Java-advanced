package day1;

/*
 * 근무시간(9~18시)이 맞으면 Y / N
 */
public class 조건문 {

	public static void main(String[] args) {
		int workTime = 10;
		
		int sTime = 10;
		int eTime = 17; // 점심시간 1시간 빼고
		int realTime = eTime - sTime -1;
		
		if(9 <= workTime && workTime <= 18) {
			System.out.println("Y");
		}else {
			System.out.println("N");
		}
		
		// 총근무시간이 8시간 이상이면 "초과근무" 출력
		if(realTime >= 8) {
			System.out.println("초과근무");
		}else {
			System.out.println("정상근무");
		}
		
	}
}
