package ex01_class;

//회원클래스
//필드:아이디,비밀번호,생년월일,키


class Member{
	//은닉화:private
	private String id;
	private String ps;//읽기불가
	private int born;
	private double height;
	//생성자:객체가 생성될 때 실행되는 메소드
	//반드시 객체가 생설될 때 생성자가 실행이 되어야 한다.
	//클래시의 이름과 같다
	//반환형이 없다
	
	//기본생성자
	//만약에 생성자가 없으면 컴파일러가 기본생성자를 생성
	//만약에 생정자를 만들면 컴파일러가 기본생성자를 생성하지 않는다.
	//생성자의 오버로딩
	Member(){};
	
	Member(String id, String ps, int born, double height){
		this.id=id;
		this.ps=ps;
		this.born=born;
		this.height=height;
	}
	
	//setter:쓰기
	void setId(String id) {
		this.id=id;
	}
	void setPs(String ps) {
		this.ps=ps;
	}
	void setBorn(int born) {
		this.born=born;
	}
	void setHeight(double height) {
		this.height=height;
	}
	//getter:읽기
	String getId() {
		return id;
	}
	String getPs() {
		
		return ps.substring(0, 2)+"**"; //비밀번호 앞두자리만 반환
	}
	int getBorn() {
		return born;
	}
	double getHeight() {
		return height;
	}
}
public class J20210419_5_Member {

	public static void main(String[] args) {
		Member mb = new Member();//기본생성자를 이용해서 객체를 생성
		mb.setId("tae9237");
		mb.setPs("7744");
		mb.setBorn(1992);
		mb.setHeight(172);
		System.out.println("아이디:"+mb.getId());
		System.out.println("패스워드:"+mb.getPs());
		System.out.println("출생년도:"+mb.getBorn());
		System.out.println("키:"+mb.getHeight());
		System.out.println("-------------------");
		

		Member mb2 = new Member("tae","7699",1992,182);
		System.out.println("아이디:"+mb2.getId());
		System.out.println("패스워드:"+mb2.getPs());
		System.out.println("출생년도:"+mb2.getBorn());
		System.out.println("키:"+mb2.getHeight());
		
		
		
	}

}
