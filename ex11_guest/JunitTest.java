package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testInsert() {
		//추가
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = new GuestDTO("홍길동","hong@gmail.com","1111","안녕하세요");
		int cnt = gdao.insert(gdto);
		System.out.println(cnt +"건 추가");
	}

	@Test
	void testUpdate() {
		//수정
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = new GuestDTO(2,"김진태","ho1840@naver.com","2222","반갑습니다");
		int cnt = gdao.update(gdto);
		System.out.println(cnt +"건 수정");
	}

	@Test
	void testDelete() {
		//삭제
		GuestDAO gdao = new GuestDAOImpl();
		int cnt =gdao.delete(8);
		System.out.println(cnt +"건 삭제");
	}

	@Test
	void testSelectOne() {
		//한건조회
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = gdao.selectOne(3);
		System.out.println(gdto);
		
		
	}

	@Test
	void testSelectList() {
		//전체조회
		GuestDAO gdao = new GuestDAOImpl();
		List<GuestDTO> glist = gdao.selectList();
		System.out.println(glist);
	}

}
