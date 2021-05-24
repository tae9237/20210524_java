package ex01_class;
//핸드폰 클래스
//필드:이름,용량,화소
//생성자,게터,세터,toString
class Phone{
	private String name;
	private int capacity;
	private int pixel;
	//생성자
	public Phone(String name, int capacity, int pixel) {
		//나자신의 생성자 호출,반드시 가장 먼저 실행
		this(name,capacity);
		this.pixel = pixel;
	}
	
	public Phone(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	//게터,세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	//오버라이딩
	@Override
	public String toString() {
		return "Phone [name=" + name + ", capacity=" + capacity + ", pixel=" + pixel + "]";
	}
	
	
	
}
public class J20210420_2_Phone {

	public static void main(String[] args) {
		Phone p = new Phone("아이폰",512,3000);
		p.setName("갤럭시");
		System.out.println("핸드폰 이름:" + p.getName());
		System.out.println("핸드폰 용량:" + p.getCapacity());
		System.out.println("카메라 화소:" + p.getPixel());
		System.out.println(p);
	}

}
