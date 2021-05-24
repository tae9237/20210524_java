package ex11_guest;

import java.sql.Connection;
import java.util.Scanner;

import ex07_jdbc.DBconn;

public class J20210506_1_main {

	public static void main(String[] args) {
		//1.방명록 작성
		//2.방명록 수정
		//3.방명록 삭제
		//4.방명록 조회
		//9.종료
		System.out.println("\t방명록기록부");
		System.out.println("*---------------------------*");
		System.out.println("1.방명록 작성");
		System.out.println("2.방명록 수정");
		System.out.println("3.방명록 삭제");
		System.out.println("4.방명록 조회");
		System.out.println("9.종료");
		System.out.println("*---------------------------*");
		
		Scanner sc = new Scanner(System.in);
		GuestDAO gdao = new GuestDAOImpl();
		int no=1;
		while(true) {
			System.out.print("번호는?");
			no=sc.nextInt();
			if(no==1) {
		
				GuestDTO gdto = new GuestDTO("홍길동","hong@gmail.com","1111","안녕하세요");
				int cnt = gdao.insert(gdto);
				System.out.println(cnt +"건 추가");
			}else if(no==2) {
				
				GuestDTO gdto = new GuestDTO(2,"김진태","ho1840@naver.com","2222","반갑습니다");
				int cnt = gdao.update(gdto);
				System.out.println(cnt +"건 수정");
			}else if(no==9) {
				ex11_guest.DBconn.dbClose();
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
