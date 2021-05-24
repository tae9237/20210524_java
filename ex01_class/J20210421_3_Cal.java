package ex01_class;

//두수를 매개변수로 받아서 합을 리턴하는 메소드

public class J20210421_3_Cal {
	public static final String maker="국제계산기";
	private int result;
	private boolean light;
	
	//두수를 매개변수로 받아서 합을 리턴하는 메소드
	//static 메소드 안에서는 static필드만 사용 가능
	static int sum(int a, int b) {
		return a+b;
	}
	int add(int a) {
		this.result+=a;
		return result;
	}
	//라이트켜기/끄기
	void light() {
		light=!light;
	}
	public static void main(String[] args) {
		J20210421_3_Cal c = new J20210421_3_Cal();
//		System.out.println(c.sum(20, 10));
		
		System.out.println(J20210421_3_Cal.sum(20, 15));
		c.light();
		

	}

}
