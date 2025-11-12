package spring004;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thejoa703.TestDao;
import com.thejoa703.dao.UserinfoDao;
import com.thejoa703.dto.UserInfoDto;

@RunWith(SpringJUnit4ClassRunner.class)  // spring 구동
@ContextConfiguration(locations = "classpath:config/root-context.xml")//설정
public class Test1 {
		@Autowired ApplicationContext context;// bean 생성 소멸
		@Autowired DataSource datasource;
		@Autowired SqlSession  sqlSession;
		@Autowired TestDao  dao;
		@Autowired UserinfoDao userdao;
		
		
		@Test
		public void test5() {
			
//			//5. 삭제
			System.out.println(userdao.delete(2));
			System.out.println(userdao.selectAll());
//			
//			//4. 수정
//					
//		    UserInfoDto dto = new UserInfoDto();
//			dto.setEmail("a@abc"); dto.setAge(100); dto.setNo(2);
//		    System.out.println(userdao.update(dto));
//		    System.out.println(userdao.selectAll());
//         //3. 
//			System.out.println(userdao.select(2));
//			
		// insert
//			UserInfoDto dto = new UserInfoDto();
//			dto.setEmail("a@bb"); dto.setAge(30); dto.setNo(3);
//			System.out.println(userdao.insert(dto));
//      		System.out.println(userdao.selectAll());
		//전체보기	
//			UserInfoDto dto = new UserInfoDto();
//			dto.setEmail("a@a"); dto.setAge(2);
//			System.out.println(userdao.insert(dto));
//			System.out.println(userdao.selectAll());
		}
		
		
		@Ignore
		public void test1() {System.out.println(context);}
		
		@Ignore
		public void test2() {System.out.println(datasource);}
		
		@Ignore //@Test 
		public void test3() {System.out.println(sqlSession);}
		
		@Ignore //@Test 
		public void test4() {System.out.println(dao.now());}
		
}
