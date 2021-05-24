package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J20210415_1_array {

	private static final boolean[] String = null;

	public static void main(String[] args) {
//		// 배열
//		int[] arr; //선언은 stack에
//		//배열은e heap에 생성
//		//자바는 동적배열
//		arr = new int[5]; //객체생성해서 주소를 arr에 대입
//		arr[0]=10;
//		System.out.println(arr[0]);
//		//arr[5] = 100; // 5번index는 없다//에러
		
		//선언하고 객체생성
//		int[] arr = new int[5];
//		//1~5값을 대입
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (i+1)*10;
//		System.out.println(arr[i]);
//		}
		
		//선언과초기화:반드시 사이즈 생략
		//int[]arr = new int[] {10,20,30};
//		int[]arr = {10,20,30};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		//for~each문
//		for(int a: arr) {
//			System.out.println(a);
//		}
//		//Arrays 클래스 이용 문자열 출력
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr.toString());
//		System.out.println(arr); //println메소드는 tostring()실행
		
		//실습)합계,평균
//		int[] score = {88,89,77};
//		int sum = 0;
//		for(int a:score) {
//			System.out.println(a);
//			sum+=a;
//		}
//		System.out.println("합계:"+sum);
//		System.out.println("평균:"+(double)Math.round(sum/3));
		
		//실습)셋 학생의 점수를 입력 받아서 합계 ,평균
//		Scanner sc = new Scanner(System.in);
//		int[] score=new int[3];
//		int sum=0;
//		for(int i=0;i<score.length;i++) {
//			System.out.print("점수는?");
//			score[i]=sc.nextInt();
//			sum+=score[i];
//		}
//		System.out.println("합계:"+sum);
//		System.out.println("평균:"+(double)Math.round(sum/3));
		
		//문자열 배열
//		String[]arr = new String[] {"java","python","c"};
//		String[]arr1 = {"바보","멍충이","똥멍충아"};
//		
//		for (int i=0;i<3;i++) {
//			System.out.println(arr1[i]);
//		}
//		for (String s:arr) {
//			System.out.println(s);
//		}
		
		//실습)좋아하는 칼라3개를 입력받아 배열에 저장하고 출력
//		Scanner sc = new Scanner(System.in);
//		String[]arr= new String[3];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print("좋아하는 칼라?");
//			arr[i]=sc.next();
//		
//			
//		}System.out.println("----------------");
//		for(String s:arr)
//		System.out.println(s);
		
		//실습)피보나치수열 n개 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("갯눈?");
//		int n = sc.nextInt();
//		int[] fibo = new int[n];
//		fibo[0] =0; fibo[1]=1;
//		for(int i=2;i<n;i++) {
//			fibo[i]=fibo[i-2] + fibo[i-1];
//			
//		}
//		for(int s:fibo)
//		System.out.println(s);
		
		//실습)시험 채점 프로그램
//		int[] right =  {1,3,4,2,1};
//		int[] answer=  {2,3,4,1,1};
//		
//		int score=0;
//		for(int i=0;i<right.length;i++) {
//			if(right[i]==answer[i]) {
//				System.out.println(i+1+"맞음");
//				score+=100/right.length;
//			}
//		}System.out.println("점수:"+score);
		
		//실습)최대값(최소값) 출력
//		int[] arr = {4,7,6,2,5};
//		int max = arr[0];
//		int min = arr[0];
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max){
//				max=arr[i];
//			}
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
		
//		System.out.println(max);
//		System.out.println(min);
		
		//배열의 복사
		//얇은복사 : 주소만 복사
//		int[] src= {1,2,3,4,5};
//		int[] desc = src;
		
//		System.out.println(src);
//		System.out.println(desc);
//		System.out.println(Arrays.toString(desc));
//		System.out.println(Arrays.toString(src));
//		System.out.println("-----------------------------");
//		src[1]=20;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(desc));
		
		//깊은복사 : 값을 복사
//		int[]src= {1,2,3,4,5};
//		int[]dest = new int[6];
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		for(int i=0;i<src.length;i++) {
//			dest[i]=src[i];
//		}
//		dest[5]=6;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		src=dest;
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
//		
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
		
//		int[] src = {1,2,3,4,5};
//		int[] dest = {0,0,0,0,0};
//		System.arraycopy(src, 2, dest, 0, 3);
//		System.out.println(Arrays.toString(src));
//		System.out.println(Arrays.toString(dest));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
