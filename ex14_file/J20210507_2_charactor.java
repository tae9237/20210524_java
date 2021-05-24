package ex14_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J20210507_2_charactor {

	public static void main(String[] args) {
		//문자기반 : 문자데이터의 입출력을 다루는 스트림
		//char형 변수 :2bye
		//자바는 모든문자를 유니코드를 기준으로 표현
		
//		char c='홍';
//		System.out.println(c);
		
		//문자단위로 쓰기
		//try-with문
//		try(FileWriter fw = new FileWriter("./data/charSample.txt")) {
//			fw.write('A');
//			fw.write("자바");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//파일 읽기
//		int ch;
//		try(FileReader fr = new FileReader("./data/charSample.txt")){
//			while((ch=fr.read())!=-1) {
//				System.out.println((char)ch);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//실습)좋아하는 칼라를 입력받아 파일을 만들고
		//파일을 읽어서 리스트를 출력
//		try(FileWriter fw = new FileWriter("./data/charSample.txt")){
//			fw.write("blue,");
//			fw.write("black");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		try(FileReader fr = new FileReader("./data/charSample.txt")){
//		int a;
//		while((a=fr.read())!=-1) {
//			System.out.print((char)a);
//		}
//		
//		
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//실습)이름과 점수를 입력받아 파일에 저장하고 
		//파일을 읽어서 합계와 평균 구하기
		//문자를 숫자로 바꾸기
		
		try(FileWriter fw = new FileWriter("./data/charSample.txt")){
			fw.write("둘리");
			fw.write("100");
			fw.write("87");
			fw.write("94");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c;
		try(FileReader fr = new FileReader("./data/charSample.txt")){
			while((c=fr.read())!=-1) {
			

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Integer.parseInt("100")+Integer.parseInt("87")
		+Integer.parseInt("94"));
		System.out.println(Double.parseDouble("100")+Double.parseDouble("87")
				+Double.parseDouble("94")/3);
		
		
		
		
		
		
		
		
	}

}
