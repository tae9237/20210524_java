package ex01_class;

import java.util.Arrays;

//학생클래쓰
//필드:반(group),이름(name),점수(score배열),(자바,파이썬,c),합계(sum)
//메소드:합계계산(sumCal),평균을계산해서 반환(avgCal)
class Student{
	String group="몇 반 : A반";
	String name ="이름 : 김진태";
	int[] score= new int[3];
	int sum;
	//합계구하기
	//method의 over loading
	void sumCal(int a, int b, int c){//합계    //call by value 방식 =>값
		sum=0;
		score[0]=a;score[1]=b;score[2]=c;
		sum=a+b+c;
	}
	void sumCal(int[] score){ //합계  //call by reference 방식 =>주소
		sum=0;
		this.score=score;//얇은복사
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
	}
	//평균구하기
	double avgCal() {
		double avg = (double)sum/score.length;
		return (double)Math.round(avg*100)/100;
	}
	
}
public class J20210419_3_Student {

	public static void main(String[] args) {
		
		Student st = new Student();
		System.out.println(st.group);
		System.out.println(st.name);
		System.out.println("--------------------");
		st.sumCal(92, 89, 99);
		System.out.println(Arrays.toString(st.score));
		System.out.println("합계:"+st.sum);
		System.out.println("평균:"+st.avgCal());
		st.sumCal(new int[] {87,91,100});
		System.out.println(Arrays.toString(st.score));
		System.out.println("합계:"+st.sum);
		System.out.println("평균:"+st.avgCal());
	}

}
