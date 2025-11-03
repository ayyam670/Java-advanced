package day2;

public class Calculator {

	// 필드 생성
	int n1;
	int n2;
	double result;
	
	// 반지름
	private double radius;         // read, write
	private double area;   // 캡슐화  read
	
	// getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	
	// 기본생성자
	public Calculator() {}

	

	// n1, n2 초기화하는 생성자
	public Calculator(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	};
	
	public void add() {
		result = n1 + n2;
//		return result;
	}
	
	public void mul() {
		result = n1 * n2;
//		return result;
	}

	// 원 면적 계산 생성자
	public Calculator(double radius) {
		this.radius = radius;
	}
	
	// 원 면적 계산 메서드
	public static double calArea(int radius) {
		return Math.PI * radius * radius;
	}
	
	// 메서드 오버로딩 (중복선언 : 같은이름 가능, 매개변수 타입, 수 다름)
	public void calArea() {
		area = Math.PI * radius * radius;
	}
	
	
	
}
