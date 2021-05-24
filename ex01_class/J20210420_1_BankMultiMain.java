package ex01_class;

import java.util.Scanner;
	
	
public class J20210420_1_BankMultiMain {

	public static void main(String[] args) {
		//여러개의계좌만등록가능
		Scanner sc = new Scanner(System.in);
	
		Bank[]banks=new Bank[3]; //객체 3개를 저장
		Bank b=null;
		int custno=0;
		while(true) {
			System.out.println("0.고객번호");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.잔액조회");
			System.out.println("9.종료");
			System.out.println("--------------------");
			System.out.print("선택?");
			int no = sc.nextInt();
			sc.nextLine();//버퍼비우기
			switch(no) {
			case 0:
				System.out.println("고객번호:");
				custno=sc.nextInt();
				break;
			case 1://계좌개설
				System.out.print("통장이름:");
				String bankname = sc.nextLine();
				System.out.print("계좌번호:");
				String bankno = sc.next();
				System.out.print("잔금:");
				int balance = sc.nextInt();
				banks[custno-1] = new Bank(bankname,bankno,balance);
				break;
			case 2://입금
				if(b==null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("입금:");
				int money = sc.nextInt();
				b.in(money);
			case 3://출금
				if(b==null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("출금:");
				int money1 = sc.nextInt();
				b.out(money1);
			case 4://잔액조회
				System.out.println("잔액:"+b.getBalance());
				break;
				
			case 9://종료
				System.out.println("프로그램종료");
				System.exit(0);
			default:
				System.out.println("잘못된선택");
					
			}
			
		}
	}
}