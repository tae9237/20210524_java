package ex04_generics;

//사각형클래스
//필드:가로,세로,넓이
//제네릭타입:인스턴스생성시 형을 결정
//T:Type, K:Key, V:Value, E:Element
class Rectangle<T>{
	private T wei;
	private T hei;
	private double area;
	
//	Rectangle(){}
	public Rectangle(T wei, T hei) {
		this.wei = wei;
		this.hei = hei;
		area = getArea(wei,hei);
	
	}
	public T getWei() {
		return wei;
	}
	public void setWei(T wei) {
		this.wei = wei;
	}
	public T getHei() {
		return hei;
	}
	public void setHei(T hei) {
		this.hei = hei;
	}
	public double getArea(T wei,T hei) {
		double result =0;
		if(wei instanceof Integer) {//wei가 Integer형이라면
			result =(int)wei *(int)hei; 
		}else if(wei instanceof Double)
			result =(double)wei*(double)hei;
		
		return result;
	}

	@Override
	public String toString() {
		return "Rectangle [wei=" + wei + ", hei=" + hei + ", area=" + area + "]";
	}
	
	
	
}

public class J20210422_1_generics {

	public static void main(String[] args) {
		Rectangle<Integer> r = new Rectangle<>(2,15);
		System.out.println(r);
		
		Rectangle<Double> r2 = new Rectangle<>(1.5,1.2);
		System.out.println(r2);

	
		
		
	}

}
