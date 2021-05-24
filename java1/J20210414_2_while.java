package java1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J20210414_2_while {

	public static void main(String[] args) {
		//반복문 : while
		//원의넓이를 구하시오
		//0을 입력하면 프로그램 종료
//		Scanner sc = new Scanner(System.in);
//		double r; //반지름
		//1안)
//		while(true) {
//			System.out.print("반지름은?");
//			r=sc.nextDouble();
//			if(r==0)break;
//			System.out.println("넓이는?"+r*r*3.14);
//			
//		}
		//2안)
//		double r=1; //반지름
//		while(r!=0) {
//			System.out.print("반지름은?");
//			r=sc.nextDouble();
//			System.out.println("넓이는?"+r*r*3.14);
//			
//		}
		//3안)
//		double r; //반지름
//		do {
//			System.out.print("반지름은?");
//			r=sc.nextDouble();
//			System.out.println("넓이는?"+r*r*3.14);
//		}while(r!=0);
		
		//실습)1~n까지의 수를 더하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("마지막수는?");
//		int n = sc.nextInt();
//		int a = 0;
//		int s = 0;
//		while(true) {
//			a++;
//			if(a>n) break;
//			s+=a;
//		}
//		System.out.println(s);
		
		//백준 : 2839번 설탕배달문제
		//5kg과 3kg의 봉지 몇개가 필요한지
		//가장 작은수의 봉지구하기
		//15kg:5kg*3
		//18kg:5kg*3+3kg*1
		//11kg:5kg*1+3kg*2
		//7kg:-1
		//1kg:-1
		
//		int nkg, count5, count3, rest;//이동할  kg수, 5kg봉지수,3kg봉지수,나머지
//		//이동해야할kg수
//		System.out.print( "배달 설탕 무게?");
//		Scanner sc = new Scanner(System.in);
//		nkg = sc.nextInt();
//		count5=nkg/5; //만약 1kg이라면 =>0
//		while(true) {
//			rest=nkg-(5*count5); //1
//			if(rest%3==0) { //나누어 떨어지면
//				count3 = rest/3;
//				System.out.printf("필요한 봉지 수 : %d(5kg) + %d(3kg)",count5,count3);
//				break;
//			}
//			else {
//				if(count5==0) { //5kg이 0이면 - 할 수 없다
//					System.out.printf("%d\n",-1);
//					break;
//				}
//				count5-=1; //5kg짜리 봉지수를 1 줄인다
//			}
//		}
		
		//실습)선택정렬
		//{2,4,5,6,7};(오름차순정렬)
		//{7,6,5,4,3};(내림차순정렬)
//		int[] sortArr= {4,6,7,2,5};
//		
//		for(int j=0;j<sortArr.length;j++) {
//			int minIndex=j; //가장 작은 값의 index
//			int min =sortArr[j];
//			for(int i=j+1;i<sortArr.length;i++) {
//				if(sortArr[i]<min) {
//					min = sortArr[i];
//					minIndex=i;
//				}
//			}
//			System.out.println(min);
//			System.out.println(minIndex);
//			//두수를 바꾸기
//			sortArr[minIndex]=sortArr[j];
//			sortArr[j]=min;
//			System.out.println(Arrays.toString(sortArr));
//			
//		}
		
		//실습)로또번호 맞춘 갯수 출력
//		int[] no = {9,12,21,25,33,42};
//		//로또번호 6를 만들기
//		//int의 범위
//		System.out.println("Max:"+Integer.MAX_VALUE);
//		System.out.println("Min:"+Integer.MIN_VALUE);
//		
//		int[] no1 = new int[6];
//		Random rd =new Random();
//		
//		
//		for(int i=0;i<no.length;i++) {
//			boolean b=false;//기존에 존재하지 않는다
//			int r = rd.nextInt(45)+1;
//			//기존에 번호가 등록되어 있다면
//			for(int j=0;j<i;j++) {
//				if (no1[j]==r) {
//					i--;
//					b=true;//존재한다
//					break;
//				}
//			}
//			if(b) continue; //or if(!b)no[i]=r;
//			no1[i]=r;
//		
//		}
//		Arrays.sort(no1); //오름차순정렬
//		System.out.println(Arrays.toString(no1));
//		
		
		
		
		
		
		
		
		
	}

}
