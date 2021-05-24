package ex01_class;

//객체를 만들어 내기 위한 틀
class Dog{
	//속성:필드
	//자동초기화
	String type="골든리트리버";
	String name="멍뭉이";
	int legs = 4;
	int cnt; //걸음수
	//기능:메소드
	void walking() {
		cnt++;
		System.out.println(name+" 걷는다");
		
	}
	//깨동이 먹는다 출력 메소드
	void eating() {
		System.out.println(name+ " 먹는다");
	}
}
public class J20210416_3_class {

	public static void main(String[] args) {
	Dog d =	new Dog();
	System.out.println(d.type);
	System.out.println(d.legs);
	d.walking(); d.eating();
	System.out.println(d.cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
