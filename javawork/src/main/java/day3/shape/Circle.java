package day3.shape;

public class Circle extends Shape {
	private String color; // 면색상
	
    // getter setter
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("원을 그리다");
	}

	@Override
	public String toString() {
		return "circle [sx=" + getSx() + ", sy=" + getSy() + ", ex=" + getEx() + ", ey=" + getEy() + "]";
	} // this,getSx() this. 생략가능
}
