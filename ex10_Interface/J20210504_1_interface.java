package ex10_Interface;
//클래스는 다중상속 불가
//인터페이스 : 구현부가 없다, 다중상속가능,객체생성 불가
interface Attack{
	String name = "포켓몬 공격"; //public static final 생략되어 있음
	String sname = "가랏! 꼬부기";
	String pname = "가랏! 피카츄";
	void attack(); //public abstract 생략가능
	//default : 일반메소드
	default void gameTime() {
		System.out.println("24시간 공격 가능");
	}
}
interface Sound{
	String name = "포켓몬 소리";
	void sound();
}
//피카
class pika implements Attack{
	@Override
	public void attack() {
		System.out.println("10만 볼트");
	}

	
}
//꼬북
class Squirtle implements Attack,Sound{
	@Override
	public void attack() {
		System.out.println("물대포");
	}
	@Override
	public void sound() {
		System.out.println("꼬북꼬북");
	}

}
//게임
class GamePlay{
	void attack(Attack a) {
		a.attack();
	}
	void sound(Sound s) {
		s.sound();
	}
}
public class J20210504_1_interface {

	public static void main(String[] args) {
		System.out.println(Attack.name);
		pika p1 = new pika();
		Squirtle s1 = new Squirtle();
		Attack at = new Squirtle();
		Sound s = new Squirtle();
		p1.gameTime();
		System.out.println("--------------");
		System.out.println(Attack.sname);
		at.attack();
		s.sound();
		System.out.println("--------------");
		System.out.println(Attack.pname);
		p1.attack();
		s1.attack();s1.sound();
		System.out.println("--------------");
		GamePlay gp = new GamePlay();
		gp.attack(p1);
		gp.attack(s1);gp.sound(s1);
		

	}

}
