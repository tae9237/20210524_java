package ex12_inner;

interface Item{
	void namePrint(String itemename);
}
public class J20210507_4_item {

	public static void main(String[] args) {
		Item item = new Item() {
			
			@Override
			public void namePrint(String itemname) {
				System.out.println(itemname);
				
			}
		};
		item.namePrint("새우깡");
	}

}
