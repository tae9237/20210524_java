package ex01_class;
//원의넓이 구하는 클래스
class Circle{
	private double r; //반지름
	private double area; //넓이
	//생성자
	Circle(){};
	Circle(double r){
		this.r=r;
		areaCal(r);//생성자에서 메소드 실행
	}
	//게터
	double getArea() {
		return area;
	}
	//메소드
	double areaCal(double r) {//원의 넓이 계산 메소드
		this.area=r*r*Math.PI;
		return area;
	}
	//원의 넓이 구하는 메소드
	double areaCal(int r) {//원의 넓이 계산 메소드
		this.area=r*r*Math.PI;
		return area;
	}
	double areaCal(double r,double pi) {//원의 넓이 계산 메소드
		area = r*r*pi;
		return area;
	}
	double areaCal(int r, double pi) {
		area = r*r*pi;
		return area;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + "]";
	}
	
}
public class J20210420_5_Area {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c);
		
		System.out.println(c.areaCal(10.5,3.14));

	}

}
