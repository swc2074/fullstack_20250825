package ex004;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.swc.dao.MilkDao;
import com.swc.dto.MilkDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test2 {
	@Autowired ApplicationContext context;// bean 생성 소멸
	@Autowired DataSource datasource;
	@Autowired SqlSession  sqlSession;
	@Autowired MilkDao dao;
	
	@Test public void test() {
	System.out.println(dao.delete(22));
//		MilkDto dto = new MilkDto();
//		 dto.setMname("name2"); dto.setMnum(2); dto.setMtotal(1000); dto.setMno(22);
//		 System.out.println(dao.update(dto));
//		
		//System.out.println(dao.select(22));
//	MilkDto dto = new MilkDto();
//		 dto.setMname("name2"); dto.setMnum(2); dto.setMtotal(1000);
//	System.out.println(dao.insert(dto));
		System.out.println("......."  +dao.selectAll());
		
	}

}
