package ex06_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_1_Exception {

	public static void main(String[] args) {
		//예외처리
//		Scanner sc = new Scanner(System.in);
//		
//		int a=10;
//		int b=0;
//		
////		b=sc.nextInt();
////		System.out.println(a/b);
//		
//		
//		while(true) {
//			System.out.print("나눌수를 입력?");
//			try {//예외발생 가능성 문장
//				b=sc.nextInt();
//				System.out.println(a/b);
//				break;
//			}catch(InputMismatchException e) {
//				System.out.println("숫자를 입력해주세요");
//				sc.nextLine();//버퍼지우기
//				e.printStackTrace();//예외발생된 지점 추적 출력
//			}catch(ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				e.printStackTrace();
//			}catch(Exception e) {//모든 예외를 처리:마지막에 처리
//				System.out.println("예외발생");
//				e.printStackTrace();
//			}	
//		}
//		System.out.println("프로그램 종료");
		
		//실습)정수를 입력받고 해당되는 index의 값 출력
//		int[]arr= {10,20,30};
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			
//			System.out.print("번호입력:");
//			int a = sc.nextInt();
//			System.out.println(arr[a-1]);
//		}catch(InputMismatchException e) {
//			System.out.println("번호입력");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("1~3사이의 수를 입력");
//
//		}catch (Exception e) {
//			System.out.println("예외발생");
//			e.printStackTrace();
//		}
//				
		
		//예외의 정류
		//1)체크예외:RuntimeException을 상속하지 않은 예외
		//네트워크나 db나 파일 등 외부와 연결되는 것들
		
		//2)언체크예외:RuntimeException을 상속한 예외
//		File file=new File("sample.txt");
//		System.out.println(file);
//		
//		try {
//			Scanner sc = new Scanner(file);
//			System.out.println("파일 읽기 성공");
//			while(sc.hasNextLine()) {
//				String s = sc.nextLine();
//				System.out.println(s);
//			}
//		} catch (FileNotFoundException e) { //체크예외
//			System.out.println("파일을 찾을 수 없습니다.");
//			e.printStackTrace();
//		}
//		
		
		
		
		
		
		
		
		

	}

}
