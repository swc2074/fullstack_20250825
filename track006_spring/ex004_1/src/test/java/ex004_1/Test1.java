package ex004_1;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  // spring 구동
@ContextConfiguration(locations = "classpath:config/root-context.xml")//설정
public class Test1 {
		@Autowired ApplicationContext context;// bean 생성 소멸
		@Autowired DataSource ds;
		@Autowired SqlSession  sqlSession;
		@Autowired TestDao dao;
		
		
		@Ignore //@Test
		public void test1() {System.out.println(context);}
		
		@Ignore //@Test
		public void test2() {System.out.println(ds);}
		
		@Ignore  //@Test 
		public void test3() {System.out.println(sqlSession);}
		
		@Test 
		public void test4() {System.out.println(dao.now());}
		
}
