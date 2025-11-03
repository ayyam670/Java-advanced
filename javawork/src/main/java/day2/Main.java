package day2;

/*
 * 테스트 
 */
public class Main {

	public static void main(String[] args) {
		// 2. 객체 생성
		//      참조변수        인스턴스(힙(메모리)에 저장공간이 할당)
		Student student = new Student();
		student.no = 20251030;
		student.name = "고길동";
		student.addr = "대구";
		
		Student s3 = new Student(20251031, "둘리");
		
		Student s4 = new Student(20251031, "또치", "대구");
		
		Professor prof = new Professor();
		
		
		// 3. 사용
		student.addSubject();
		
		// 얕은 복사
		Student student2 = student;
		student2.name = "홍길동";
		
		System.out.println(student.name);
		System.out.println(student == student2);
		
		System.out.println(s3.name);
		System.out.println(s4.name);
	}
}
