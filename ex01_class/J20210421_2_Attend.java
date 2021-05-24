package ex01_class;

//수강생클래스
//필드:코드,이름,수강과목
class Attendee{
	
	private String code;
	private String name;
	private String subject;
	
	Attendee(){}
	public Attendee(String code, String name, String subject) {
		super();
		this.code = code;
		this.name = name;
		this.subject = subject;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Attendee [code=" + code + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
}

//수강클래스 : LectureManager
//메소드:입실 출력,퇴실 출력
	//자바반 홍길동 일실
class LectureManager{
	//클래스필드,클래스변수
	//클래스가 메모리에 로딩될 때 생성,프로그램이 종료시 소멸
	static final String collegeName="국제학원";
	//인스턴스필드,객체변수
	//인슨턴스생성시 생성, 객체소멸시 소멸
	//static final:상수(반드시 선언과 동시에 초기화)
	int buildYear=2001;
	static final int day;
	static {//static변수를 초기화
		int a=21;
		day=a;
	}
	void enter(Attendee att) {
		System.out.println(day+"일 "+att.getSubject() +" " + att.getName()+"님 입실" );
	}
	//자바반 홍길동 퇴실
	void exit(Attendee att) {
		System.out.println(day+"일 "+att.getSubject() +" " + att.getName()+"님 퇴실" );
	}
}
public class J20210421_2_Attend {

	public static void main(String[] args) {
		System.out.println(LectureManager.collegeName);
		Attendee attd1 = new Attendee("A001","홍길동","자바");
		System.out.println(attd1);
		
		LectureManager ma = new LectureManager();
		System.out.println(ma.buildYear);
		ma.enter(attd1);
		ma.exit(attd1);
		
		

	}

}
