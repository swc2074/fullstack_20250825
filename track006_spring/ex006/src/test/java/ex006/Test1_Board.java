package ex006;

import java.rmi.UnknownHostException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.AppUserDao;
import com.thejoa703.dto.AppUserDto;
import com.thejoa703.service.AppUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")

public class Test1_Board {
	
	@Autowired ApplicationContext context;
	@Autowired DataSource  ds;
	@Autowired SqlSession session;
	@Autowired AppUserDao dao;
	@Autowired AppUserService service;
	
	@Ignore @Test public void test1() {System.out.println(context);}
	@Ignore @Test public void test2() {System.out.println(ds);}
	@Ignore @Test public void test3() {System.out.println(session);}
	
	@Test public void test7() {
		
		//삭제
		
		  AppUserDto dto = new AppUserDto(); dto.setAppUserId(45);
		  System.out.println(dao.deleteAdmin(dto));
		
		
		// 3. 해당값 유저확인
		System.out.println(dao.select(45));
		
		//4. 수정
		
//		 AppUserDto dto = new AppUserDto(); dto.setMbtiTypeId(3);
//		 dto.setAppUserId(45); System.out.println(dao.updateAdmin(dto));
		 
				
//1.  전체
		// System.out.println(dao.selectAll());
//[AppUserDto(appUserId=45, email=1@1, password=1, mbtiTypeId=1, ufile=user6.png, bhit=0, bip=null, createdAt=null)
		
	}
	
	
	
	@Ignore @Test public void test6() {
		System.out.println(dao.iddouble("1@1"));
		System.out.println(dao.iddouble("9@9"));
		System.out.println(dao.iddouble("2@2"));
		
	}
	
	@Ignore @Test public void test5( )  throws UnknownHostException{
		
	//5.	delete
//		AppUserDto dto = new AppUserDto();
//		dto.setAppUserId(30); dto.setPassword("1111");
//		System.out.println(service.delete(dto));
//		System.out.println(service.selectAll());

	
		//4. update
		AppUserDto dto = new AppUserDto();
		dto.setAppUserId(28); dto.setEmail("d666666@dvvv");
		dto.setPassword("55"); dto.setMbtiTypeId(3);
		
		System.out.println(service.update(dto));
		//System.out.println(service.select(28));
		//System.out.println(service.selectAll());
		
		

//		
		
		//3. select
		
		//System.out.println(service.select(2));
		System.out.println(service.selectAll());
		
		//2. insert
//		AppUserDto dto = new AppUserDto();
//		dto.setAppUserId(66);
//		dto.setEmail("g66@uuh");
//		dto.setPassword("66");
//		dto.setMbtiTypeId(6);
//		dto.setCreatedAt(null);
//        System.out.println(service.insert(dto));
		
		
	
	}
	
	@Ignore @Test public void test4() {
		
		
		//5. delete
//		AppUserDto dto = new AppUserDto();
//		dto.setPassword("22"); dto.setAppUserId(22);
//		System.out.println("6" + dao.delete(dto));
//		 
//		System.out.println("1. " + dao.selectAll());
		
		
		//4. update
//		AppUserDto dto = new AppUserDto();
//		dto.setPassword("22"); dto.setMbtiTypeId(3);
//		dto.setEmail("d@d"); dto.setAppUserId(22);
//		System.out.println(dao.update(dto));
//		System.out.println(dao.select(22));
		

//		
		//3. select
//		System.out.println(dao.select(2));
//		System.out.println(service.selectAll());
		
		//2. insert
//		AppUserDto dto = new AppUserDto();
//		dto.setAppUserId(22);
//		dto.setEmail("g@G");
//		dto.setPassword("22");
//		dto.setMbtiTypeId(2);
//		
//		System.out.println(dao.insert(dto));
	//	System.out.println(dao.selectAll());
				
		//1. selectAll
  		//System.out.println(dao.selectAll());
		
	}

}
