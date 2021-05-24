package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;

public class J20210427_1_member{

	public static void main(String[] args) {
		// member 데이터 추가
		MemberDAO mdao = new MemberDAO(); //객체 생성
		Scanner sc = new Scanner(System.in);
		boolean logincheck=false; //로그인여부
		String login_userid="";//로그인된 아이디
		while (true) {
			System.out.println("-------------------");
			System.out.println("--국제 회원관리 v1.0.0");
			System.out.println("-------------------");
			System.out.println("0.로그인");
			System.out.println("1.회원가입");
			System.out.println("2.회원수정");
			System.out.println("3.회원삭제");
			System.out.println("4.회원한명조회");
			System.out.println("5.회원전체조회");
			System.out.println("9.종료");
			System.out.println("-------------------");
			System.out.print("번호:");
			int no= sc.nextInt();
			if (no==0) { //로그인
				//userid , passwd 입력받기
				System.out.print("아이디는:");
				String userid = sc.next();
				System.out.print("패스워드는:");
				String passwd = sc.next();
				//userid 체크 :아이디가 존재하지 않습니다.
				MemberDTO mdto = mdao.selectOne(userid);
				System.out.println(mdto);
				if (mdto==null) {
					System.out.println("아이디가 존재하지 않습니다.");
					logincheck=false;
				}else {
					//passwd체크:패스워드 일치 하지 않습니다.
					//db의passwd와 입력한 passwd가 일치한다면 로그인 성공
					if(mdto.getPasswd().equals(passwd)) {
						System.out.println("로그인성공");
						logincheck=true;
						login_userid="";
					}else {
						System.out.println("패스워드 불일치");
					}
				}
				
				
				
			}
			else if (no==5) { //전체조회
				if(logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				List<MemberDTO> mlist = mdao.selectList();
				System.out.println("--------------------");
				System.out.println("-----회원리스트-----");
				System.out.println("--------------------");
				for(MemberDTO mdto : mlist) {
					System.out.print(mdto.getUserid() +" ");
					System.out.print(mdto.getPasswd() +" ");
					System.out.print(mdto.getBirthyear() +" ");
					System.out.println(mdto.getRegdate() +" ");
				}
			}else if (no==4) {//한건조회
				List<MemberDTO> mlist = mdao.selectList();
				System.out.println("--------------------");
				System.out.println("---등록된 아이디----");
				System.out.println("--------------------");
				for(MemberDTO mdto : mlist) {
					System.out.println(mdto.getUserid());
				}
				System.out.println("--------------------");
				System.out.print("조회할 회원아이디?");
				String userid = sc.next();
				MemberDTO mdto = mdao.selectOne(userid);
				System.out.println(mdto.getUserid());
				System.out.println(mdto.getPasswd());
				System.out.println(mdto.getBirthyear());
				System.out.println(mdto.getRegdate());
			}else if (no==1) {//추가
				System.out.println("-----------------");
				System.out.println("----회원가입-----");
				System.out.println("-----------------");
				
				String userid;
				while (true) {
					System.out.print("아이디?");
					userid = sc.next();
					//아이디 중복체크
					MemberDTO mdto = mdao.selectOne(userid);
					System.out.println(mdto);
					if (mdto == null) //데이터가 있다면
						System.out.println("중복된 아이디입니다.");
					else break;
				}
				
				System.out.print("패스워드?");
				String passwd = sc.next();
				sc.nextLine(); //버퍼 처리
				int birthyear = 0; //태어난해를 입력안하면 0으로 기본값
				System.out.print("태어난해?");
				String birthyearS = sc.nextLine();
				if (!birthyearS.equals("")) //입력했다면
					birthyear =  Integer.parseInt(birthyearS); //문자를 숫자로 변환
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				int cnt = mdao.insert(mdto);
				if (cnt >0) {
					System.out.println("회원가입 완료");
				}else {
					System.out.println("회원가입 실패");
				}
				
			}else if (no==2) {//수정
				//로그인된 아이디 정보만 수정가능
				//기존정보 조회후 수정정보와 같이 전달
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue;
				}
				System.out.println("-----------------");
				System.out.println("----회원수정-----");
				System.out.println("-----------------");
				System.out.print("아이디?");
				String userid = sc.next();
				//로그인된 아이디 정보만 수정가능
				
				
				
				//기존정보 조회후 수정정보와 같이 전달
				MemberDTO mdto = mdao.selectOne(userid);
				String passwd;
				int birthyear;
				System.out.print("패스워드?");
				passwd = sc.next();
				sc.nextLine(); //버퍼 처리
				birthyear = 0; //태어난해를 입력안하면 0으로 기본값
				System.out.print("태어난해?");
				String birthyearS = sc.nextLine();
				if (!birthyearS.equals("")) //입력했다면
					birthyear =  Integer.parseInt(birthyearS); //문자를 숫자로 변환
				mdto = new MemberDTO(userid, passwd, birthyear);				
				int cnt = mdao.update(mdto);
				if (cnt >0) {
					System.out.println("수정 완료");
				}else {
					System.out.println("수정 실패");
				}
				
			}else if (no==3) {//삭제
				//로그인된 아이디 정보만 삭제가능
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue;
				}
				System.out.println("-----------------");
				System.out.println("----회원삭제-----");
				System.out.println("-----------------");				
				System.out.print("아이디?");
				String userid = sc.next();
				if(!login_userid.equals(userid)) {
					System.out.println("삭제권한이 없습니다.");
					continue;
				}
				int cnt = mdao.delete(userid);
				if (cnt >0) {
					System.out.println("삭제 완료");
				}else {
					System.out.println("삭제 실패");
				}
					
			}else if (no == 9) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		

	}

}
