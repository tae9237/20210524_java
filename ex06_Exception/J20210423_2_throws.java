package ex06_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_2_throws {
	static void arrayIndex(int index) {
		int[] arr = {10,20,30};
		try {
			System.out.println(arr[index]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 선택입니다.");
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		
	}
	//throws :예외를 던진다
	static void arrayIndex_throws(int index)  throws ArrayIndexOutOfBoundsException{
		int[] arr = {10,20,30};
		
		System.out.println(arr[index]);
	}
	
	//파일을 읽기 메소
	static void fileRead(String Filename) {
		File file=new File(Filename);
		System.out.println(file);
	
		try {
			Scanner sc = new Scanner(file);
			System.out.println("파일 읽기 성공");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) { //체크예외
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		//throws:예외던지기
//		J20210423_2_throws.arrayIndex(4);
//		//던진예외를 처리
//		try {
//			J20210423_2_throws.arrayIndex_throws(4);
//			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("throws로 처리 :잘못된 선택입니다.");
//		}catch(Exception e) {
//			System.out.println("예외발생");
//		}
		
		//파일읽기 메소드 호출
		J20210423_2_throws.fileRead("sample.txt");
	
		
	}

}
