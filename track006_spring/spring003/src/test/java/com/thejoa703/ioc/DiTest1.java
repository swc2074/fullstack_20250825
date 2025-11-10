package com.thejoa703.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@RunWith(SpringJUnit4ClassRunner.class) // spring 구동
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class DiTest1 {
	@Autowired ApplicationContext context; // bean
	// 2. ApplicationContext - bean 생성부터 소멸까지 관리
	// 3. @Autowired 생성자, 프로퍼티가 있는지 테스트하고 자동연결, 적용
	
	@Test public void test() {
		IceCreamShop bera31 = context.getBean("iceCreamShop",IceCreamShop.class);
		bera31.open();
	}

}
