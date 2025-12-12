package com.thejoa703;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.thejoa703.dao.AppUserDao;
import com.thejoa703.dto.AppUserDto;
import com.thejoa703.dto.AuthDto;

@SpringBootTest
@Transactional   // 테스트 실행중 발행 db변경 자동 롤백
class Boot1ApplicationTests2_User {
	@Autowired AppUserDao dao;
	
	@Test
	public void testCrudAppUserAuth() {
		//1. 회원가입 - 사용자입력
		AppUserDto user = new AppUserDto();
		
		user.setEmail("1@1"); user.setPassword("1"); user.setMbtiTypeId(1);
		user.setUfile("1.png"); user.setMobile("0111"); user.setProvider("local");
		user.setProviderId("local_001");
		int result = dao.insertAppUser(user);
//		int createdId = user.getAppUserId();
		System.out.println("................1" + result);
		//2.        - 권한입력
		AuthDto auth = new AuthDto();
		auth.setAppUserId(0);
		auth.setEmail("1@1");
		auth.setAuth("ROLE_USER");
		int result_auth = dao.insertAuth(auth);
		System.out.println("....................2" + result_auth);
		//auth.setAppUserId(0);
		
		//3. 로그인
		AppUserDto login = new AppUserDto();
		login.setEmail("1@1"); login.setProvider("local");
		System.out.println("...............3" + dao.readAuthByEmail(login));
		
		//4. 아이디중복
		AppUserDto iddouble = new AppUserDto();
		iddouble.setEmail("1@1"); iddouble.setProvider("local");
		System.out.println("...............4" + dao.iddoubleByEmail(iddouble));
		
		//5. 마이페이지
		AppUserDto mypage = new AppUserDto();
		mypage.setEmail("1@1"); mypage.setProvider("local");
		AppUserDto findUser = dao.findByEmail(mypage);
		int id = findUser.getAppUserId();
		System.out.println("...............5" + findUser);
		
		
		//6. 수정
		AppUserDto update = new AppUserDto();
		update.setNickname("nickname001"); update.setAppUserId(id);
		System.out.println("...............6" + dao.updateAppUser(update));
		
		//7. 사용자삭제
		
		AppUserDto delete = new AppUserDto();
		 delete.setAppUserId(id);
		System.out.println("...............7" + dao.deleteAppUser(delete));
		//8. 권한 삭제
		AuthDto dauth = new AuthDto();
		dauth.setEmail("1@1");
		System.out.println("...............8" + dao.deleteAuth(dauth));
		
	}
	

}
