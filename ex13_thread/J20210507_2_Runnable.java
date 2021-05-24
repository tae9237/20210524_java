package ex13_thread;
//스레드만들기 2
//class MyRunn implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println("runnable "+i);
//		}
//		
//	}
//	
//}
public class J20210507_2_Runnable {

	public static void main(String[] args) {
//		MyRunn myRun = new MyRunn();//실행구현
//		Thread th = new Thread(myRun);//쓰레드 생성
//		th.start();//쓰레드 시작
		
		//익명클래스
//		Runnable MyRun = new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=0;i<10;i++) {
//					System.out.println("runnable "+i);
//				}
//				
//			}
//		};
//		Thread th = new Thread(MyRun);
//		th.start();
		
		//스레드 우선수위 : 1~10(클수록 높음)
		//스레드 1생성
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("runnable "+i);
				}
				
			}
		});
		th.setPriority(1);//우선순위 가장 낮다
		th.start();	
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("스레드2: "+i);
				}
				
			}
		});
		th2.setPriority(2);//우선순위 가장 높다
		th2.start();
		
		//main스레드에서 동작
		for(int i=0;i<10;i++) {
			System.out.println("스레드2: "+i);
		}
	}

}
