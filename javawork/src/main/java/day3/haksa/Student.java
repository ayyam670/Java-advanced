package day3.haksa;

public class Student extends Member {
	// 필드
	private int grade;

	// 기본생성자(매개변수x)
	public Student() {};
	
	// 생성자
	public Student(int no, String name, int grade) {
		this.grade = grade;
		this.no = no;
		this.name = name;
	}
	
	// getter setter	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	

	// 메서드 선언
	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override  // 부모(Member)에 정의한걸 재정의
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade +"]";
	}
	
}
