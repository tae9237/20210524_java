package ex01_class;
//상품클래스(item)
//필드:itemcode(코드),itmename(이름),price(단가)
//메소드:
//1)판매금액 계산 : 매개변수(판매수량),리턴값(판매금액)
class Item{
	//private접근제한자:클래스 내부에서만 접근 가능
	private String itemcode;
	private String itemname;
	private int price;
	int amount(int a){
		return price*a;
	}
	//메소드를 이용해서 접근
	//세터(setter)
	//this는 객체자신
	void setItemcode(String itemcode) {
		this.itemcode=itemcode;
	}
	void setItemname(String itemname) {
		this.itemname=itemname;
	}
	void setPrice(int price) {
		this.price=price;
	}
	//getter
	String getItemcode() {
		return itemcode;
	}
	String getItemname() {
		return itemname;
	}
	int getPrice() {
		return price;
	}
	
}
public class J20210419_4_item {

	public static void main(String[] args) {
		Item Item = new Item();
		Item.setItemcode("8801");
		Item.setItemname("파워에이드");
		Item.setPrice(2000);
		System.out.println(Item.getItemcode()
				+" "+Item.getItemname()
				+" " +Item.getPrice()
				+" 판매금액:"+Item.amount(2));
		
		
		Item item = new Item();
		Item.setItemcode("8802");
		Item.setItemname("코카콜라");
		Item.setPrice(1500);
		System.out.println(Item.getItemcode()
				+" "+Item.getItemname()
				+" " +Item.getPrice()
				+" 판매금액:"+Item.amount(3));
		
	}

}
