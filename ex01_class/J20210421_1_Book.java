package ex01_class;

import java.util.Arrays;

//책 클래스
//필드:책코드(String),책명(String),단가(int),할인율(double)
//생성자, 게터,세터, toString
//메소드:판매금액계산(매개변수:수량,반환값:판매금액)
class Book{
	private String bookcode;
	private String bookname;
	private int price;
	private double discount;
	
	//생성자
	Book(){}
	public Book(String bookcode, String bookname) {
		this.bookcode = bookcode;
		this.bookname = bookname;
		
	}
	//판매금액 계산
	int saleCal(int qty) {
		return(int)(price-price*discount)*qty;
	}
	
	
	//게터,세터
	public String getBookcode() {
		return bookcode;
	}

	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}



	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", price=" + price + ", discount=" + discount
				+ "]";
	}

}
//책 관리 클래스
class Manager{
	//판매금액합계
	//book001:0,book002:1
	private int[] tot = new int[10];
	int[] getTot() {
		return tot;
	}
	//판매금액 계산
		int saleCal(Book book,int qty, int index) {
//			System.out.println(book);
//			System.out.println(qty);
			String bookcode = book.getBookcode();
			int price = book.getPrice();
			double discount = book.getDiscount();
			int totPrice=(int) ((price-price*discount)*qty);
			tot[index]+=totPrice;
							
			return totPrice;
 }
}
public class J20210421_1_Book {

	public static void main(String[] args) {
//		Book[] barr = new Book[10];
//		barr[0]=new Book();
//		
//		Book b = new Book("Book001","마음백문백답");
//		barr[0].setPrice(12000);
//		barr[0].setDiscount(0.1);
////		System.out.println(b);
//		barr[1] = new Book();
//		barr[0].setBookname("이것이 자바다");
//		barr[0].setPrice(50000);
//		barr[0].setDiscount(0.2);
//		Manager mg = new Manager();
//		
//		System.out.println(barr[0].getBookname() + " 판매금액:"+mg.saleCal(barr[0], 3,0));
//		S
//		
//		System.out.println("-----------------------------");
//		System.out.println(Arrays.toString(mg.getTot()));
		
	
	}

}
