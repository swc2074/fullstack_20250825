package spring005;

import java.net.UnknownHostException;
import java.util.HashMap;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.dao.Sboard1Dao;
import com.thejoa703.service.Sboard1Service;


@RunWith(SpringJUnit4ClassRunner.class)  // spring 구동
@ContextConfiguration(locations = "classpath:config/root-context.xml")//설정

public class Test1_Board { 
		@Autowired ApplicationContext context;// bean 생성 소멸
		@Autowired DataSource ds;
	    @Autowired SqlSession session;
		@Autowired Sboard1Dao dao;
		@Autowired Sboard1Service service;
		
		
		@Ignore @Test public void test1() { System.out.println(context);}
		@Ignore @Test public void test2() { System.out.println(ds);}	
		@Ignore@Test public void test3() { System.out.println(session);}
		
		@Test public void test6() throws UnknownHostException{ 
			HashMap<String, String> para= new HashMap<>();
			para.put("search", "%t%");
			
			System.out.println(dao.selectSearch(para));
		}
		
		
		
		
 @Ignore @Test public void test5() throws UnknownHostException{ 
			
			//5. delete
//			Sboard1Dto dto = new Sboard1Dto();
//			dto.setId(41); dto.setBpass("1");
//			System.out.println(service.delete(dto));
//			System.out.println(service.selectAll());
	
	
			//4. update
//			Sboard1Dto dto = new Sboard1Dto();
//			dto.setBtitle("title-new"); dto.setBcontent("content-new");
//			dto.setBpass("1111"); dto.setId(5);
//			System.out.println(service.update(dto));
//			
			//3. select
			System.out.println(service.select(20));
//			System.out.println(service.selectAll());
			
			//2. insert
//			Sboard1Dto dto = new Sboard1Dto();
//			dto.setAppUserId(22); dto.setBtitle("title22");
//			dto.setBcontent("content22"); dto.setBpass("1111");
//			
//			System.out.println(service.insert(dto));
//			System.out.println(service.selectAll());
			//1. selectAll
      		//System.out.println(service.selectAll());
			
			
			
		}
		
		
		
		
		
		@Ignore@Test public void test4() throws UnknownHostException{ 
			
			//5. delete
//			Sboard1Dto dto = new Sboard1Dto();
//			dto.setBpass("1111"); dto.setId(5);
//			System.out.println(dao.delete(dto));
//			System.out.println(dao.selectAll());
//			
//			//4. update
//			Sboard1Dto dto = new Sboard1Dto();
//			dto.setBtitle("title-new"); dto.setBcontent("content-new");
//			dto.setBpass("1111"); dto.setId(5);
//			System.out.println(dao.update(dto));
//			
//			//3. select
//			//System.out.println(dao.select(5));
//			
//			//2. insert
//			Sboard1Dto dto = new Sboard1Dto();
//			dto.setAppUserId(33); dto.setBtitle("title33");
//			dto.setBcontent("content33"); dto.setBpass("1111");
//			dto.setBip(InetAddress.getLocalHost().getHostAddress());
//			System.out.println(dao.insert(dto));
//			System.out.println(dao.selectAll());
//			//1. selectAll
//      		//System.out.println(dao.selectAll());
//			
			
			
		}

}
