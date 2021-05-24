package java1;

import java.util.Scanner;

public class J20210414_3_for {

	public static void main(String[] args) {
		// 반복문 : for
//		for(int i=0;i<10;i++) {
//			System.out.println(i+1);
//		}
		
		//실습)1~10합 구하기
//		int s=0;
//		for(int i=1;i<11;i++) {
//			s+=i;
//		}
//		System.out.println(s);
		
		//실습)업다운게임만들기
		//1)1~ 100사이의 숫자 중 한개를 랜덤주출
		//2)사용자에게 정수 입력받기
		//3)랜덤수와 비교해서 업 또는 다운을 출력
		//4)2~3을 반복 
		//5)반복하면서 정답을 입력하면 사용자 승리
		
		//1안)
//		Scanner sc = new Scanner(System.in);
//		int r =(int) (Math.random()*100+1);
//		System.out.println("정답은:"+r);
//		int a;
//		boolean win = false;//성공여부(실패했다고 가정
//		for(int i=0;i<6;i++) {
//			System.out.print("숫자를 맞춰봐:");
//			if(!sc.hasNext()) { //입력한 값이 숫자가 아니면
//			 sc.nextInt(); //버퍼지우기
//			 i--; //게임 잔여수 복구
//			 continue; //반복문의 처음으로 다시 돌아가서 계속 진행
//			}
//			a=sc.nextInt();
//			//업/다운/성공
//			 if(a<r)
//				 System.out.println("업");
//			 else if(a>r)
//				 System.out.println("다운");
//			 else {
//				 System.out.println("정답");
//			 	 win=true;
//			 	 break;
//			 }
//		}
//		if(!win)System.out.println("실패");
		
		//2안)
//		Scanner sc = new Scanner(System.in);
//		int r =(int) (Math.random()*100+1);
//		
//		int a,cnt=0;
//		boolean win = false;//성공여부(실패했다고 가정
//		while(true) {
//			System.out.printf("%d 숫자를 맞춰봐:",cnt+1);
//			if(!sc.hasNext()) {
//			 sc.nextInt();
//			 continue;
//			}
//			a=sc.nextInt();
//			//업/다운/성공
//			cnt++;
//			 if(a<r)
//				 System.out.println("업");
//			 else if(a>r)
//				 System.out.println("다운");
//			 else {
//				 System.out.println("정답");
//			 	 win=true;
//			 	 break;
//			 }
//			 if(cnt>9)break;
//		}
//		if(!win)System.out.println("실패");
		
		
		//실습)구구단
		
//		for(int i=2;i<10;i++) {
//			System.out.printf("[%d]\n",i);
//			for (int j=1;j<10;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}
		
		//실습)소수 구하기
		//1안)
//		int a=7;
//		boolean b =true; //소수여부
//		for(int i=2;i<a;i++) {
//			if(a%i==0)
//			System.out.println(i+" "+"소수가 아닙니다.");
//			b=false;
//			break;
//		}
//		if(b) {
//			System.out.println("소수입니다.");
//		}
		
		//2안)
//		int a=7;
//		int i;
//		for(i=2;i<a;i++) {
//			if(a%i==0)
//			System.out.println(i+" "+"소수가 아닙니다.");
//			break;
//		}
//		if(i==5) {
//			System.out.println("소수입니다.");
//		}
		
		//실습)1~100까지의 수중 소수 구하기
		
		boolean b; //소수여부
		for(int j=2;j<101;j++) {
			b = true; //소수라고 가정하고 시작
			for(int i=2;i<j;i++) {
				if(j%i==0) {//나누어 떨어지면 소수가 아님
					b=false;//소수가 아님
					break;
				}
			}
			
			if(b) {
				System.out.println(j+"");
			}
		}
		
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
