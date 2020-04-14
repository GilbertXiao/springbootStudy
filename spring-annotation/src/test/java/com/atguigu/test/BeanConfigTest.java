package com.atguigu.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;

public class BeanConfigTest {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	@Test
	public void test01() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person)applicationContext.getBean("person");
		log.info(person.toString());
		
	}
	
	@Test
	public void test02() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = (Person)applicationContext.getBean(Person.class);
		log.info(person.toString());
		
		String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
		for(String name:beanNames) {
			log.info(name);
		}
	}
	
	@Test 
	public void test03() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for(String name:beanNames) {
			log.info(name);
		}
		Environment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("os.name");
	}
}
