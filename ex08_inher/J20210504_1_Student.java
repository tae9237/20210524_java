package ex08_inher;

class School{
	void schoolName() {
		System.out.println("유명학교");
	}
	void info(String name) {};//컴파일 에러를 피하기 위해서
}

class Stud extends School{
	void info(String name) {
		System.out.println(name + "학생");
	}
}

class Tech extends School{
	void info(String name) {
		System.out.println(name + "선생님");
	}
}

public class J20210504_1_Student {
	public static void main(String[] args) {
		
		School s1 = new Stud();
		s1.schoolName();
		((Stud)s1).info("홍길동");
		
		s1.info("을지문덕");

		
		Stud s2 = (Stud)s1;
		s2.info("이순신");
		
		s1 = new Tech();
		((Tech)s1).info("김진태");
		s1.info("장보고");
		
	}

}
