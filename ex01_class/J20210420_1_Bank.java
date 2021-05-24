package ex01_class;

import java.util.Scanner;

//은행클래스:Bank
//필드:은행명(bankname),계좌번호(bankno),잔액(balance)
//생성자,게터,세터

class Bank{
	//필드
	private String bankname;
	private String bankno;
	private int balance;
	//생성자
	Bank(String bankname, String bankno, int balance){
		this.bankname=bankname;
		this.bankno=bankno;
		this.balance=balance;
	}
	//세터
	void setBankno(String bankno) {
		this.bankno=bankno;
	}
	void setBankname(String bankname) {
		this.bankname=bankname;
	}
	//게터
	String getBankname() {
		return bankname;
	}
	String getBankno() {
		return bankno;
	}
	int getBalance() {
		return balance;
	}
	
	//입금메소드
	void in(int money) {
		balance+=money;
	}
	//출금메소드
	void out(int money) {
		if(balance-money<0) {
			balance+=money;
			System.out.println("잔액부족");
		}else {
			balance-=money;
		}
	}
	//어노테이션
	//오버라이딩:부모클래스의 메소드를 재정의
	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}
	
	
}
public class J20210420_1_Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Bank[]banks=new Bank[3];
		Bank b=null;
		
		while(true) {
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
			case 1://계좌개설
				System.out.print("통장이름:");
				String bankname = sc.nextLine();
				System.out.print("계좌번호:");
				String bankno = sc.next();
				System.out.print("잔금:");
				int balance = sc.nextInt();
				b = new Bank(bankname,bankno,balance);
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
				
			case 9://종료
				System.out.println("프로그램종료");
				System.exit(0);
			default:
				System.out.println("잘못된선택");
					
			}
			
		}
		
		
		
//		Bank b = new Bank("카카오","2019281",15000);
//		System.out.println("계좌이름:" + b.getBankname());
//		System.out.println("계좌번호:" + b.getBankno());
//		System.out.println("잔금:" + b.getBalance());
//		b.in(1500);
//		System.out.println("입금:" + b.getBalance());
//		b.out(1000);
//		System.out.println("출금:" + b.getBalance());
//		System.out.println(b);
//		System.out.println("--------------------");
//		Bank b1 = new Bank("디딤돌은행","32838",20000);
//		System.out.println("계좌이름:" + b1.getBankname());
//		System.out.println("계좌번호:" + b1.getBankno());
//		System.out.println("잔금:" + b1.getBalance());
//		System.out.println(b1);
		
		
	}

}
