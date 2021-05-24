package ex01_class;

//계산기
class Cal{
	//속성:필드
	String maker="국제계산기";
	//기능:메소드
	int add(int a, int b) {//더하기:더한값을리턴
		int r= a+b;
		return r;
	}
	int add1(int a,int b) {
		
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
}

public class J20210419_1_cal {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.maker);
		int a=25, b=2;
		int r=c.add(a,b);
		System.out.println("더하기:"+r);
		System.out.println("빼기:"+c.add1(a, b));
		System.out.println("빼기:"+c.mul(a, b));
		System.out.println("빼기:"+c.div(a, b));
	}

}
