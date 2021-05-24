package ex01_class;

import java.util.Arrays;

class Sum{
	//두정수를 매개변수로 받아서 합을 리턴하는 메소드
	int sum (int a, int b){
		return a+b;
	}	
	 
	//세정수를 매개변수로 받아서 합을 리턴하는 메소드
	int sum (int a, int b, int c) {
		return a+b+c;
	}
	//배열을 매개변수로 받아서 합을 마지막index에 넣고 리턴하는 메소드
	 int sum(int[]arr) {
		 System.out.println(Arrays.toString(arr));
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 sum+=arr[i];
		 }
		 arr[arr.length-1]=sum; //마지막 index에 합계넣기
		 return sum;
	 }
	 //가변인자
	 int addVarargs(int...arr) {
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 sum+=arr[i];
		 }
		 return sum;
	 }
	 //문자열을 가변인자로 받아서 출력
	 void arr(String...arr) {
		 for(String s:arr) {
			 System.out.println(s);
		 }
	 }
}
public class J20210420_3_overload {

	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(20, 30));
		System.out.println(s.sum(30, 40, 10));
		System.out.println("-------------------");
		//배열
		int[] arr= {10,20,30,40};
		System.out.println(s.sum(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------");
		//가인인자
		System.out.println(s.addVarargs(10,20,30,40,50));
		s.arr("java","python","orcle");
		
		
	}
		
}
