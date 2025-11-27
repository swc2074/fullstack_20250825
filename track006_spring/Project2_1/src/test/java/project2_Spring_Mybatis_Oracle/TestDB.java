package project2_Spring_Mybatis_Oracle;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.AppUserMapper;
import com.thejoa703.dto.AppUser;
import com.thejoa703.service.AppUserSecuritySevice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/root-context.xml", "classpath:config/security-context.xml"})

public class TestDB {
	@Autowired ApplicationContext context;
	@Autowired DataSource ds;
	@Autowired SqlSession sqlSession;
	@Autowired AppUserMapper dao;
	@Autowired AppUserSecuritySevice service;
	
	@Test public void test5() {		
		
		
		
		
///////////delete	
	AppUser dto = new AppUser(); 
	dto.setAppUserId(69); dto.setPassword("1"); dto.setEmail("2@2");
	System.out.println(service.delete( dto)); 
	}
	
		
		
///////////update	
//	AppUser dto = new AppUser(); 
//	
//	dto.setMbtiTypeId(1); dto.setUfile("2.png");
//	dto.setMobile("77"); dto.setNickname("nickname2");
//	MockMultipartFile file = new MockMultipartFile("file2","file2.txt","text/plain","".getBytes());
//	dto.setAppUserId(77);
//	System.out.println(service.update(file, dto)); 
//	}
	
		
		
		
		
		
///////////insert	
//	AppUser dto = new AppUser(); 
//	dto.setEmail("1@123"); dto.setPassword("1");
//	dto.setMbtiTypeId(1); dto.setUfile("2.png");
//	dto.setMobile("123"); dto.setNickname("nickname123");
//	MockMultipartFile file = new MockMultipartFile("file","file.txt","text/plain","".getBytes());
//	System.out.println(service.insert(file, dto)); 
//	}
	
	
	
	@Ignore @Test public void test4() {	}	
///////////select	
//	AppUser dto = new AppUser(); 
//	dto.setEmail("1@1");
//	System.out.println(dao.selectPassword(dto)); 
//	}
///////////select	
//		AppUser dto = new AppUser(); 
//		dto.setEmail("1@1");
//		System.out.println(dao.select(dto)); 
//		}
		
		///////////delete	
//		AppUser dto = new AppUser(); 
//		dto.setAppUserId(68);
//		System.out.println(dao.delete(dto)); 
//		}
		
	
		///////////update
//		AppUser dto = new AppUser(); 
//		dto.setMbtiTypeId(1); 
//		dto.setUfile("2.png");
//		dto.setMobile("2222");
//		dto.setNickname("nickname3");
//		
//		
//		dto.setAppUserId(69);
//		System.out.println(dao.update(dto)); }
		
		/////////////insert
//		AppUser dto = new AppUser(); 
//		dto.setEmail("3@3"); 
//		dto.setPassword("1"); 
//		dto.setMbtiTypeId(1); 
//		dto.setUfile("3.png");
//		dto.setMobile("3333");
//		dto.setNickname("nickname3");
//		System.out.println(dao.insert(dto)); }
	
	
	
	@Ignore @Test public void test1() { System.out.println(context); }
	@Ignore @Test public void test2() { System.out.println(ds); }
	@Ignore @Test public void test3() { System.out.println(sqlSession); }

}
