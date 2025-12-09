
package sboard1_Test;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  // spring 구동
@ContextConfiguration(locations = "classpath:config/root-context.xml")//설정

public class Test1{ 
	@Autowired ApplicationContext context;
	@Autowired DataSource ds;
	
	@Test public void test1() {System.out.println(context);}
		

}
