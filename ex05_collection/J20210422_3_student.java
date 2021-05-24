package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//학생클래스
//필드:번호, 이름, 전화번호
class Student{
	private int no;
	private String name;
	private String tel;
	
	Student(){}
	public Student(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
}

public class J20210422_3_student {

	public static void main(String[] args) {
//		Student s = new Student(1, "김진태","7744-7699");
//		Student s1 = new Student(2, "강아지","8942-5961");
//		Student s2 = new Student(6, "고양이", "7469-1688");
		
		//ArrayList에 저장
//		List<Student> list = new ArrayList<>();
//		list.add(s);
//		list.add(s1);
//		list.add(s2);
//		System.out.println(list);
	
		//반복문
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//			Student ss=list.get(i);
//			System.out.println(ss.getNo()+" "+ss.getName()+" "+ss.getTel());
//		}			
//		System.out.println("-----------------------------------------------");
//		for(Student ss:list) {
//			System.out.println(ss.getNo()+" "+ss.getName()+" "+ss.getTel());
//		}
		
		
		//Map에 저장 (Key :no, Value:Student)
//		Map<Integer, Student> map=new HashMap<>();
//		map.put(s.getNo(), s);
//		map.put(s1.getNo(), s1);
//		map.put(s2.getNo(), s2);
//		System.out.println(map);
//	
//		Student ss = map.get(6);
//		System.out.println(ss.getNo()+" "+ss.getName()+" "+ss.getTel());
//		
//		//Set:중복되지 않는 데이터들, 순서가없다.
//		Set<Integer> ks = map.keySet();
//		System.out.println(ks);
//	
//		for(int k:ks) {
//			System.out.println(k);
//		}System.out.println("--------------------");
//		
//		Iterator<Integer> it=ks.iterator();
//		while(it.hasNext()) {
//			int key = it.next();
//			System.out.println(key);
//			Student sss =map.get(key);
//			System.out.println(sss.getNo()+" "+sss.getName()+" "+sss.getTel());
//			
//		}
		
		//실습)
		//result:"success"
		//data: ArrayList<Student>
		
		Student s = new Student(1, "김진태","7744-7699");
		Student s1 = new Student(2, "강아지","8942-5961");
		Student s2 = new Student(6, "고양이", "7469-1688");
		
		Map<String, Object> map = new HashMap<>();
		map.put("result", "success");
//		System.out.println(map);
		
		List<Student> list = new ArrayList<>();
		list.add(s);
		list.add(s1);
		list.add(s2);
//		System.out.println(list);
		
		map.put("data", list);
		System.out.println(map);
		
		String result =(String) map.get("result"); //다운캐스팅
		//만약 result가 success라면 학생정보 출력
		//아니면 에러 출력
		if(result.equals("success")) {
			System.out.println("성공");
			List<Student> stdlist = (List<Student>)map.get("data");
			System.out.println(stdlist);
			for(Student ss : stdlist) {
				System.out.println(ss);
				System.out.println(ss.getNo()+" "+ss.getName()+" "+ss.getTel());
			}
		}else {
			System.out.println("에러");
		}
		
		
		
		
		
		
		
		
		
	}

}
