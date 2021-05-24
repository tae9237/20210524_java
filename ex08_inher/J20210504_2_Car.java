package ex08_inher;
//부모 클래스
class Mycar{
	static final String name = "람보르기니";
}
//타이어 부품
class Tire extends Mycar{
	private String company;//회사이름

	public Tire(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "타이어 회사 :" + company;
	}
	
}
//미러 부품
class Mirror extends Mycar{
	private String company;

	public Mirror(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "백미러 회사 :" + company;
	}
	
}
//수리업체 클래스
class Repair{
	//부품을 체인지 해주는 메소드
	//다형성을 이용
	void changePart(Mycar t) {
		System.out.println(t + "교체완료");
	}
//	void changePart(Mirror m) {
//		System.out.println(m +"교체완료");
//	}
}

public class J20210504_2_Car {

	public static void main(String[] args) {
		System.out.println(Mycar.name);
		
		Tire t1 = new Tire("넥센타이어");
		System.out.println(t1);
		
		Mirror m1 = new Mirror("미러링");
		System.out.println(m1);
		
		Repair r1 = new Repair();
		r1.changePart(t1);
		r1.changePart(m1);;
		
		
	}

}
