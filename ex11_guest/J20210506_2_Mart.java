package ex11_guest;

import java.util.ArrayList;
import java.util.List;

interface Product{//공상품코너
	void prodouctnamePrint(String...s);
	
}
interface Meat{//정육코너
	void meatnamePrint(String...s);
	
}
interface Cloth{//의류코너
	void clothnamePrint(String...s);

}
class Head0ffice{//본사
	private String companyName="풍 마트";
	private String registrationNumber ="777-77-77777";
	void companyInfoPrint() {
		System.out.println(companyName);
		System.out.println(registrationNumber);
	}
}

class Branch1 extends Head0ffice implements Product,Meat{//지점1
	private String branchName="신림점";
	private List<String>meatList;
	private List<String>productList = new ArrayList<>();//공산품 상품 목록
	
	//세터,게터
	
	public List<String> getMeatList() {
		return meatList;
	}

	public void setMeatList(List<String> meatList) {
		this.meatList = meatList;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
	
	@Override
	public void meatnamePrint(String...s) {
		System.out.println("["+ branchName+"] 공산품 코너");
		for(String item:s) {
			System.out.println(item +" ");
		}
		System.out.println();
	}

	@Override
	public void prodouctnamePrint(String...s) {
		System.out.println("["+ branchName+"] 정육점 코너");
		for(String item:s) {
			System.out.println(item +" ");
		}
		System.out.println();
	}
}
class Branch2 extends Head0ffice implements Product,Cloth{//지점2
	private String branchName="봉천점";
	@Override
	public void clothnamePrint(String...s) {
		System.out.println("["+ branchName+"] 의류품 코너");
		for(String item:s) {
			System.out.println(item +" ");
		}
		System.out.println();
	}

	@Override
	public void prodouctnamePrint(String...s) {
		System.out.println("["+ branchName+"] 공산품 코너");
		for(String item:s) {
			System.out.println(item +" ");
		}
		System.out.println();
	}

	
	
}
public class J20210506_2_Mart {

	public static void main(String[] args) {
		Branch1 b1 = new Branch1();
		b1.companyInfoPrint();
		System.out.println("------------------");
		b1.prodouctnamePrint("생활용품","문구","침구","가전");
		b1.meatnamePrint("소고기","돼지고기","닭고기");
		System.out.println("------------------");
		Branch2 b2 = new Branch2();
		b2.clothnamePrint("자켓","바지","티");
		b2.prodouctnamePrint("생활용품","문구","침구","가전");
		
		
	}

}
