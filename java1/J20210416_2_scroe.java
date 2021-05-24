package java1;

import java.util.Scanner;

public class J20210416_2_scroe {

	public static void main(String[] args) {
		
		//성적프로그램(while문)
//		String[] sub = {"국어","영어","수학"};
//		int[][] score = new int [2][3]; //점수배열
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			//타이틀
//			System.out.println("----------------------------");
//			System.out.println("국제    성적      관리      프로그램   V1.0.0");
//			System.out.println("----------------------------");
//			System.out.println("1.성적등록");
//			System.out.println("2.학생별 합계/평균");
//			System.out.println("3.과목별 합계/평균");
//			System.out.println("9.시스템 종료");
//			System.out.println("-9---------------------------");
//			System.out.print("몇번 번호?");
//			int no = sc.nextInt();
//			
//			if(no==1) {
//				//점수입력받기
//				for(int i=0;i<score.length;i++) {
//					System.out.printf("[%d]번\n",i+1);
//					for(int j=0;j<score[i].length;j++) {
//						System.out.printf("%s?",sub[j]);
//						score[i][j]=sc.nextInt();
//					}
//				}
//				System.out.println("----------------------------");
//				
//			}else if(no==2) {
//				//학생별로 합계,평균 출력
//				for (int i=0;i<score.length;i++) {
//					int sum=0;
//					for(int j=0;j<score[i].length;j++) {
//						sum+=score[i][j];
//					}//합계
//					System.out.printf("[%d]합계:%d 평균:%.2f\n",i+1,sum,(double)sum/score.length);
//				}
//					System.out.println("----------------------------");
//				
//				
//			}else if(no==3) {
//				//과목별로 합계,평균출력
//				for(int j=0;j<score[0].length;j++) {
//					int sum=0;
//					for(int i=0;i<score.length;i++) {
//						//System.out.println(score[i][j]);
//						sum+=score[i][j];
//					}
//					System.out.printf("[%s]합계:%d 평균:%.2f\n",sub[j],sum,(double)sum/score.length);
//				}
//			
//				
//			}else if (no==9) {
//				System.out.println("시스템종료");
//				break;
//			}else
//				System.out.println("잘못된 번호");
//		}
		
		
		
		//2) switch문
//		String[] sub = {"국어","영어","수학"};
//		int[][] score = new int [2][3]; //점수배열
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			//타이틀
//			System.out.println("----------------------------");
//			System.out.println("국제    성적      관리      프로그램   V1.0.0");
//			System.out.println("----------------------------");
//			System.out.println("1.성적등록");
//			System.out.println("2.학생별 합계/평균");
//			System.out.println("3.과목별 합계/평균");
//			System.out.println("9.시스템 종료");
//			System.out.println("----------------------------");
//			System.out.print("몇번 번호?");
//			int no = sc.nextInt();
//			
//			switch(no){
//			case 1:
//				//점수입력받기
//				for(int i=0;i<score.length;i++) {
//					System.out.printf("[%d]번\n",i+1);
//					for(int j=0;j<score[i].length;j++) {
//						System.out.printf("%s?",sub[j]);
//						score[i][j]=sc.nextInt();
//					}
//				}
//				System.out.println("----------------------------");
//			case 2:
//				//학생별로 합계,평균 출력
//				for (int i=0;i<score.length;i++) {
//					int sum=0;
//					for(int j=0;j<score[i].length;j++) {
//						sum+=score[i][j];
//					}//합계
//					System.out.printf("[%d]합계:%d 평균:%.2f\n",i+1,sum,(double)sum/score.length);
//				}
//					System.out.println("----------------------------");
//			case 3:
//				//과목별로 합계,평균출력
//				for(int j=0;j<score[0].length;j++) {
//					int sum=0;
//					for(int i=0;i<score.length;i++) {
//						//System.out.println(score[i][j]);
//						sum+=score[i][j];
//					}
//					System.out.printf("[%s]합계:%d 평균:%.2f\n",sub[j],sum,(double)sum/score.length);
//				}break;
//			case 9:
//				System.out.println("시스템종료");
//				System.exit(0); //프로그램종료
//			default:
//				System.out.println("잘못된 번호");
//			
//			}
//		}
				
				
				
			
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
