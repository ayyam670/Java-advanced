package day3.shape;

public class Line extends Shape {

	private int style;
	
	// 생성자는 상속 X
	// 부모의 필드 초기화 부모생성자 호출
	
	
	
	public Line(int sx, int sy, int ex, int ey) {
		super(sx, sy, ex, ey);
//		setSx(sx); 도 가능
	}
	
	public Line() {}

	public Line(int sx, int sy, int ex, int ey, int style) {
		super(sx, sy, ex, ey);
		this.style = style;
	}
	
	// getter setter
	public int getStyle() {
		return style;
	}
	public void setStyle(int style) {
		this.style = style;
	}

	@Override
	public void draw() {
		System.out.println("선을 그리다");
	}
	
	
	
}
