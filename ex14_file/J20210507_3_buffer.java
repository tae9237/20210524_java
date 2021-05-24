package ex14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//public class J20210507_3_buffer {

//	public static void main(String[] args){
		//한줄씩 쓰기
		//문자 버퍼 보조
		//파일에 문자단위로 출력	
//		Scanner sc = new Scanner(System.in);
//		//try~with문:파일 close 자동
//		try(BufferedWriter bw = new BufferedWriter(
//				new FileWriter("./data/bufferWriter.txt"))) {
//			while(true) {
//				System.out.print("이름,국,영수?");
//				String data = sc.nextLine();
//				if(data.equals("quit")) {
//					System.out.println("프로그램종료");
//					break;
//				}
//				bw.write(data);
//				bw.newLine(); //개행
//				
//			}
//			
//		}catch (Exception e) {
//			System.out.println("예외발생");
//		}
		
		//한줄씩 읽기
//		try(BufferedReader br = new BufferedReader(new FileReader("./data/bufferWriter.txt"))) {
//			String s= null;
//			while((s=br.readLine()) != null) {
//				String[] data = s.split(",");
//				//System.out.println(Arrays.toString(data));
//				int sum=0; //과목의 합계
//				for(int i=1; i<4;i++) {
//					sum += Integer.parseInt(data[i]);
//				}
//				System.out.println("이름:" + data[0]);
//				System.out.println("합계:" + sum);
//				System.out.printf("평균:%.2f\n", sum/3.);
//				System.out.println("----------------------");
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	
//		
//	}	
//
//}
