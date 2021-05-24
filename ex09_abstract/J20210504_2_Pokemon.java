package ex09_abstract;
//포켓몬:추상클래스
abstract class Pokemon{
	//일반메소드
	void gameName() {
		System.out.println("포켓몬 게임");
	}
	//추상메소드
	abstract void name();
	abstract void attack();
	abstract void sound();
}
//피카츄
class Pikachu extends Pokemon{
	@Override
	void name() {
		System.out.println("가라! 피카츄");
	}
	@Override
	void attack() {
		System.out.println("10만볼트");
	}
	@Override
	void sound() {
		System.out.println("피카피카");
	}

}
//꼬부기
class Squirtle extends Pokemon{
	@Override
	void name() {
		System.out.println("가라! 꼬북기");
	}
	@Override
	void attack() {
		System.out.println("물대포");
	}
	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	}
	
}

//게임
class GamePlay{
	void namePlay(Pokemon pok) {
		pok.name();
	}
	void attackPlay(Pokemon pok) {
		pok.attack();
	}	
	void soundPlay(Pokemon pok) {
		pok.sound();
	}
}
public class J20210504_2_Pokemon {
	public static void main(String[] args) {
		Pikachu p1 = new Pikachu();
		Squirtle s1 = new  Squirtle();
		GamePlay gp = new GamePlay();
		p1.gameName();
		System.out.println("-------------------");
		gp.namePlay(p1);gp.attackPlay(p1); gp.soundPlay(p1);
		System.out.println("-------------------");
		gp.namePlay(s1);gp.attackPlay(s1); gp.soundPlay(s1);
		
		
	}

}
