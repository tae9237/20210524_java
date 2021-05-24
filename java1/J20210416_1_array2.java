package java1;

import java.util.Scanner;

public class J20210416_1_array2 {

	public static void main(String[] args) {
		//2차원 배열
//		int[][] arr = new int[3][4];
//		int[][] arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

//		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		System.out.println(arr[1][2]);
		
//		for(int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[i].length;j++) 
//				System.out.printf("%3d",arr[i][j]);
//			System.out.println();
//			
//		}
//		//for each
//		for(int[] s:arr) {
//			for(int s1:s) {
//				System.out.println(s1);
//			}
//		}
	
		//실습)
		//1안)
//		int[][] arr = new int[3][4];
//		//1~12 대입 : 반복문을 이용해서
//		int no=0;
//		for (int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i]. length;j++) {
//				arr[i][j]=++no;
//				System.out.println(arr[i][j]);
//			}
//		}
		//2안)
//		int[][] arr = new int[3][4];
//		//1~12 대입 : 반복문을 이용해서
//		for (int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i]. length;j++) {
//				arr[i][j]=(i*4)+j+1;
//				System.out.println(arr[i][j]);
//			}
//		}
		//실습) 국영수 평균 합계
		//1안)
//		Scanner sc = new Scanner(System.in);
//		int[][] score = new int [2][3];
//		
//		
//		for(int i=0;i<score.length;i++) {
//			int sum=0;
//			System.out.printf("%d번 국영수 점수:",i+1);
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j]=sc.nextInt();
//				sum+=score[i][j];
//				 
//			}
//			System.out.println("합계:"+sum);
//			System.out.println("평균:"+(double)+sum/3);
//			
//		}
	
		
	
	
	
	
	
	}

}