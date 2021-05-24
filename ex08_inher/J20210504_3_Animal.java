package ex08_inher;
//동물
class Animal{
	
}

//토끼
class Rabbit extends Animal{

	@Override
	public String toString() {
		return "토끼";
	}
}

//사자
class Lion extends Animal{

	@Override
	public String toString() {
		return "사자";
	}
	
	
}
class AnimalCare{
	//먹이주기 메소드
	void eating(Animal ani) {
		System.out.println(ani + "가 밥을 먹어요");
	}
	//목욕시키기 메소드
	void Washing(Animal ani) {
		System.out.println(ani+ "가 깨끗하게 씻어요");
	}
}
public class J20210504_3_Animal {
	public static void main(String[] args) {
		//객체생성
		Rabbit r1 = new Rabbit();
		Lion l1 = new Lion();
		AnimalCare ac = new AnimalCare();
		
		//메소드 실행
		ac.eating(r1);
		ac.Washing(r1);
		System.out.println("-------------------");
		ac.eating(l1);
		ac.Washing(l1);
		System.out.println("-------------------");
		ac.eating(new Rabbit());
		ac.eating(new Lion());
	}

}
