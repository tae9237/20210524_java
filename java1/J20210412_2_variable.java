package java1;

import java.math.BigDecimal;

public class J20210412_2_variable {

	public static void main(String[] args) {
		// 정수형 변수
//		int a=30,b=20;
//		System.out.println(a + " + " + b + " = " + (a+b));
//		System.out.println(a + " - " + b + " = " + (a-b));
//		System.out.println(a + " * " + b + " = " + (a*b));
//		System.out.println(a + " / " + b + " = " + (double)(a/b));
//		
//		System.out.printf("%d + %d = %d\n",a,b,a+b);
//		System.out.printf("%d - %d = %d\n",a,b,a-b);
//		System.out.printf("%d * %d = %d\n",a,b,a*b);
//		System.out.printf("%d / %d = %.2f\n",a,b,(double)a/b);
		
//		byte b = 10;
//		System.out.println(b);
		
		//실수형
//		float f= 3.14f; //4byte
//		double d= 3.14; //8byte
//		
//		System.out.println(f); System.out.println(d);
		
		//부동소수점의 오차
//		double d = 608.4, d2 = 206.2;
//		System.out.println(d+d2);
//		System.out.printf("%.1f\n",d+d2);
		
		//정확한 계산을 해야 할 경우(돈계산등)
		//참조형 생성
//		BigDecimal b1 = new BigDecimal("608.4");
//		BigDecimal b2 = new BigDecimal("206.2");
//		
//		BigDecimal result = b1.add(b2);
//		System.out.println(result);
		
		//문자형
//		char c = 'a';
//		System.out.println(c);
//		char c1 = '가';
//		System.out.println(c1); //유니코드
//		System.out.println(c1 +0); //코드화(유니코드값 출력)
		
		//논리형
//		boolean b = true;
//		System.out.println(b);
		
		//문자열은 형이 없다
		//참조형
//		String s1 = new String("자바");
//		String s2 = "자바";
//		System.out.println(s1);
//		System.out.println(s2);
		
		//형변환
		//자동형변환
		//명시적인 형변환
//		byte b=10;
//		int a =b; //자동형변환(작은형이 큰형으로 자동형변환)
//		byte c=(byte)a; //명시적인 형변환 (큰형이 작은형의 변환)
//		System.out.println(c);
//		System.out.println(b);
//		System.out.println(a);
		
		//상수
//		final float PI = 3.14f;
//		PI=5.15f // 상수는 변경 불가능
//		System.out.println(PI);
		
		
		
	}

}
