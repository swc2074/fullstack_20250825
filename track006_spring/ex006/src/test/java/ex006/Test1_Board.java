package ex006;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")

public class Test1_Board {
	
	@Autowired ApplicationContext context;
	@Autowired DataSource  ds;
	@Autowired SqlSession session;
	@Autowired AppUserDao dao;
	
	@Ignore @Test public void test1() {System.out.println(context);}
	@Ignore @Test public void test2() {System.out.println(ds);}
	@Ignore @Test public void test3() {System.out.println(session);}
	
	@Test public void test4() {
		
		
		//5. delete
		AppUserDto dto = new AppUserDto();
		dto.setPassword("22"); dto.setAppUserId(22);
		System.out.println("6" + dao.delete(dto));
		 
		System.out.println("1. " + dao.selectAll());
		
		



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
		System.out.println(dao.selectAll());
		
		
		
		
		//1. selectAll
  		//System.out.println(dao.selectAll());
		
		
		 
		
	}

}
