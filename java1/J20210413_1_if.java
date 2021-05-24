package java1;

import java.util.Scanner;

public class J20210413_1_if {

	public static void main(String[] args) {
		//조건문 : if
		//두수를 입력받아 큰수를 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두수를 입력?");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(a>b) {
//			System.out.println(a);
//			System.out.println("a가 더 큽니다.");
//		}
//		else {
//			System.out.println(b);
//			System.out.println("b가 더 큽니다.");
//		}
		
		//실습)등급출력(절대평가)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수는?");
//		int a = sc.nextInt();
//		
//		if(a>=90)
//			System.out.println("A 등급입니다.");
//		else if(a>=80)
//			System.out.println("B 등급입니다.");
//		else if(a>=70)
//			System.out.println("C 등급입니다.");
//		else if(a>=60)
//			System.out.println("D 등급입니다.");
//		else
//			System.out.println("F 등급입니다.");
		
		//실습)등급출력(상대평가)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("전체인원수?");
//		int tot = sc.nextInt();
//		System.out.print("등수는?");
//		int grade = sc.nextInt();
//		
//		if(grade <=tot*0.15)
//			System.out.println("A학점");
//		else if (grade < tot*0.35)
//			System.out.println("B학점");
//		else if (grade < tot *0.50)
//			System.out.println("C학점");
//		else
//			System.out.println("F학점");
		
		//실습)화씨(F) <=>섭씨(C)로 바꾸기
		//공식 (1)화씨온도를 섭씨온도로
				//섭씨온도 = (화씨온도 -32)*5/9
			//(2) 섭씨온도를 화씨온도로
				//화씨온도 = 섭씨온도 *9/5+32
		//온도 : 10 C 또는 100 F
//		Scanner sc = new Scanner(System.in);
//		System.out.print("온도는?");
//		int t = sc.nextInt();
//		String s = sc.next();
//		System.out.println(t+ "  " +s);
//		
//		//문자열 비교시 equals 메소드를 이용하여 비교
//		if(s.equals("C")) {//섭씨온도라면
//			System.out.println("화씨온도:"+ (t*(double)9/5+32));
//		}else if(s.equals("F")) {//화씨온도라면
//			System.out.println("섭씨온도:"+ (t-32)*(double)5/9);
//		}else {//그외
//			System.out.println("잘못된 온도");
//		}

		//실습)계산기
		//입력값 : 10 + 20 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력값 :");
//		int a = sc.nextInt();
//		String s = sc.next();
//		int b = sc.nextInt();
//		System.out.println(a+s+b);
//		
//		if (s.equals("+"))
//			System.out.println("결과:"+(a+b));
//		else if(s.equals("-"))
//			System.out.println("결과:"+(a-b));
//		else if(s.equals("*"))
//			System.out.println("결과:"+(a*b));
//		else if(s.equals("/"))
//			System.out.println("결과:"+(double)a/b);
//		else
//			System.out.println("오류");

		//계산기(입력값 확인)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력값 :");
//		System.out.println("숫자"+sc.hasNextInt());
		
		//코드인스펙션:규율 ==true,false 비교 하지 않는다.
//		if(sc.hasNextInt()) { //숫자라면
//			int a = sc.nextInt();
//			System.out.println(a);
//		}else
//			System.out.println("잘못된숫자");
		
		
//		if(!sc.hasNextInt()) { //숫자가 아니라면
//			System.out.println("잘못된숫자");
//			
//		}else {
//			int a = sc.nextInt();
//			System.out.println(a);
//		}
		
		
		//실습)아이디/패스워드 체크
//		String myid ="java";
//		String myps ="9496";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디를 입력해주세요:");
//		String id = sc.next();
//		System.out.print("패스워드를 입력해주새요:");
//		String ps = sc.next();
//		System.out.println("아이디 :"  +myid);
//		System.out.println("패스워드 :" +myps);
//		
//		if(id.equals(myid)&&ps.equals(myps)) {
//			System.out.println("아이디가 일치합니다.");
//			System.out.println("패스워드가 일치합니다.");
//		}else
//			System.out.println("오류");
		
		//실습)년을 입력받고 윤년체크하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇년도:");
//		int year = sc.nextInt();
//		System.out.println(year);
//		
//		if(year%4==0 && year%100!=0 ||year%400==0){
//			System.out.println("윤달입니다.");
//		}else
//			System.out.println("윤달이 아닙니다.");

		//실습)메뉴판
//		Scanner sc = new Scanner(System.in);
//		System.out.println("------------------");
//		System.out.print("1.자장면\n"+"2.짬봉\n"+"3.설렁탕"+"4.비빔밥\n"+"5.피자\n"+"6.스파게티\n");
//		System.out.println("------------------");
//		System.out.print("메뉴를 선택하세요?");
//		int a = sc.nextInt();
//		
//		if(a==1||a==2)
//			System.out.println("중식코너로 가세요");
//		else if(a==3||a==4)
//			System.out.println("한식코너로 가세요");
//		else if(a==5||a==6)
//			System.out.println("양식코너로 가세요");
//		else
//			System.out.println("다시선택해주세요");
		
		//실습)전기사용요금
//		Scanner sc = new Scanner(System.in);
//		System.out.print("월 사용량?");
//		int use = sc.nextInt();
//		double won;
//		int use=140; //사용량
//		double eleUse1 = 88.3; //1단계 전력량 요금
//		double eleUse2 = 182.9;//2단계 전력량 요금
//		double eleUse3 = 275.6;//3단계 전력량 요금
//		int base; //기본요금
//		
//		
//		if(use<=200) { //1단계
//			base=910;
//			 won = base + use * eleUse1;
//		}
//		else if(use<=400) {//2단계
//			base=1600;
//			 won = base + (200 * eleUse1)+((use-200)*eleUse2);
//		}
//		else {//3단계
//			base=7300;
//			 won = base + (200 * eleUse1)+(200*eleUse2)+((use-400)*eleUse3);
//		}
//
//		System.out.println("사용요금:" +Math.floor(won));//버림
//		System.out.println("사용요금:" +Math.ceil(won));//올림
//		System.out.println("사용요금:" +Math.round(won));//반올림
//		System.out.println("사용요금:" +(int)won);
		
		//무작위의 수 추출
		//0<=랜덤값<1
		//r*(end-start+1)+start
//		double r = Math.random();
//		System.out.println(r);
//		System.out.println((int)(r*6+1)); //1~6
//		System.out.println((int)(r*(10-5+1)+5)); //5~10  //(마지막 값 - 시작값 +1)+시작값
//		System.out.println((int)(r*(20-11+1)+11));//11~20
		
		
		//주사위 게임
//		Scanner sc = new Scanner(System.in);
//		int a =(int) (Math.random()*6+1);
//		int b =(int) (Math.random()*6+1);
//		System.out.println("A:"+a);
//		System.out.println("B:"+b);
//		if(a>b)
//			System.out.println("a가 승");
//		else if(b>a)
//			System.out.println("b가 승");
//		else
//			System.out.println("무승부");
			

		
	
		
		
		
		
		
		
	}

}
