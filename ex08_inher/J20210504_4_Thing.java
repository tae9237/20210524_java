package ex08_inher;

import java.util.HashMap;
import java.util.Map;

class Thing{
	
}

class Note extends Thing{
	public String toString() {
		return "노트";
	}
}

class Pen extends Thing{
	public String toString() {
		return "펜";
	}
}
//입고클래스
class Enter{
	//재고 저장 맵
	Map<String,Integer> map = new HashMap<>();
	//입고메소드
	void enter(Thing th,int qty) {
		System.out.println(th.toString()+ qty + "개 입고");	
		Integer stockQTy = map.get(th.toString()); //기존 재고 조회
		if(stockQTy==null) stockQTy=0; //재고가 없을경우 초기화
		map.put(th.toString(), stockQTy+qty); //재고 누적
		
	}
	//재고 출력 메소드
	void stockPrint(Thing th) {
		System.out.println(th.toString() +" 현재재고:" + map.get(th.toString())+"개");
	}
}
public class J20210504_4_Thing {
	public static void main(String[] args) {
		
		Enter en = new Enter();
		Pen pen = new Pen();
		Note note = new Note();
		en.enter(pen, 10);
		en.enter(pen, 20);
		en.stockPrint(pen);
		System.out.println("---------------------------");
		en.enter(note, 15);
		en.enter(note, 20);
		en.stockPrint(note);
		
	
	}

}
