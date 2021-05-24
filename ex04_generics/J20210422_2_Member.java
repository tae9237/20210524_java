package ex04_generics;

//멤버클래스
//필드:아이디, 비밀번호
class Member{
	private String id;
	private String pw;
	
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
	
	
}
//Vip
//필드:아이디,비밀번호,할인율
class Vip{
	private String id;
	private String pw;
	private double discount;
	
	Vip(){}
	public Vip(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Vip [id=" + id + ", pw=" + pw + ", discount=" + discount + "]";
	}
	
}
//로그인 관리 클래스
class LoginManager<T>{
	//로그인메소드
	void login(T m) {
		System.out.println(m);
		if(m instanceof Member) {
			System.out.println(((Member)m).getId()+"님 환영합니다");
		}else if(m instanceof Vip) {
			System.out.println(((Vip)m).getId()+"님 환영합니다");
		}
	}
}
public class J20210422_2_Member {

	public static void main(String[] args) {
		Member m = new Member("java","7744");
//		System.out.println(m);
		
		Vip v = new Vip();
		v.setId("python");v.setPw("7699");v.setDiscount(0.1);
//		System.out.println(v);
		
		//로그인
		LoginManager<Member> lm = new LoginManager<>();
		lm.login(m);
		
		LoginManager<Vip> lmvip = new LoginManager<>();
		lmvip.login(v);;
		
		
		
		
	}

}
