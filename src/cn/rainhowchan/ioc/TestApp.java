package cn.rainhowchan.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	@Test
	public void demo01(){
		String xmlPath="applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}
	
	@Test
	public void demo2(){
		String xmlPath="applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.addUser();
	}
}
