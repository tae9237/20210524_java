package ex01_class;

//결과값이 저장되는 계산기
class NewCal{
	//필드:maker,result(결과값)
	String maker="한정판 계산기";
	double result;
	//메소드:결과값에 더하는 기능
	//더하기
	//오버로딩:매개변수의 갯수나 형이 다른경우 매소드의 이름을 중복가능
	void add(double a) {
		System.out.println("double 메소드");
		result+=a;
	}
	double add(double a, double b) {
		return a+b;
	}
	void add(int a) {
		System.out.println("int 메소드");
		result+=a;
	}
	//빼기
	void sub(double a) {
		result-=a;
	}
	//곱하기
	void mul(double a) {
		result*=a;
	}
	//나누기
	void div(double a) {
		result/=(double)a;
	}
}

public class J20210419_2_newCal {

	public static void main(String[] args) {
		NewCal nc = new NewCal();
		System.out.println(nc.maker);
		nc.add(10);
		System.out.println(nc.result);
		nc.sub(5);
		System.out.println(nc.result);
		nc.mul(3);
		System.out.println(nc.result);
		nc.div(2);
		System.out.println(nc.result);
		nc.add(21, 17);
		System.out.println(nc.add(21,17));
	

		

	}

}
