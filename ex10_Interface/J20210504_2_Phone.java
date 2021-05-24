package ex10_Interface;
interface Call{
	String function = "핸드폰 기능";
	void call();
	
}
interface Photo{
	void photo();
}
interface Memo{
	void memo();
}
//전화, 사진찍기
class Phone implements Call,Photo{
	@Override
	public void photo() {
		System.out.println("512화소");
	}
	@Override
	public void call() {
		System.out.println("전화걸기");
	}


}
//전화,사진찍기,메모
class NewPhone implements Call,Photo,Memo{
	@Override
	public void memo() {
		System.out.println("메모");
	}
	@Override
	public void photo() {
		System.out.println("816화소");
	}
	@Override
	public void call() {
		System.out.println("전화걸기");
	}
	
}
//폰사용
class PhoneUse{
	void meme(Memo m) {
		m.memo();
	}
	void photo(Photo p) {
		p.photo();
	}
	void call(Call c) {
		c.call();
	}
}
public class J20210504_2_Phone {
	public static void main(String[] args) {
		System.out.println(Call.function);
		PhoneUse pu = new PhoneUse();
		NewPhone np = new NewPhone();
		Phone p = new Phone();
		
		pu.call(p);pu.photo(p);
		System.out.println("--------------------");
		System.out.println(Call.function);
		pu.call(np);pu.photo(np);pu.meme(np);

	}

}
