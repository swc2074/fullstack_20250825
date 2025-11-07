package spring002_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pawjectTest001.ioc.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class BeanTest {
	
	@Autowired ApplicationContext context;
	// 2. ApplicationContext - bean 생성부터 소멸까지 관리
	// 3. @Autowired 생성자, 프로퍼티가 있는지 테스트하고 자동연결, 적용
	
	@Test public void test() {
		AnimalFarm farm = (AnimalFarm) context.getBean("animalFarm");
		farm.show();
	}

}

/*
 
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'cat' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanDefinition(DefaultListableBeanFactory.java:683)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getMergedLocalBeanDefinition(AbstractBeanFactory.java:1218)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:284)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:351)
	... 44 more


 */ 
