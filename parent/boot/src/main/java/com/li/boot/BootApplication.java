package com.li.boot;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BootApplication.class, args);
//		第一种方式
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		AbstractBeanDefinition definition = new RootBeanDefinition(Date.class);
//		beanFactory.registerBeanDefinition("myDate",definition);
//		BeanFactory container = beanFactory;
//		Object myDate = beanFactory.getBean("myDate");
//		System.out.println(myDate);

//		第二种方式

//		BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//		//需要XmlBeanDefintionReader帮我们去解析xml
//		XmlBeanDefinitionReader beanDefinitionReader= new XmlBeanDefinitionReader(beanDefinitionRegistry);
//		//加载需要解析的xml
//		beanDefinitionReader.loadBeanDefinitions("classpath:application.xml");
//
//		BeanFactory container = (BeanFactory) beanDefinitionRegistry;
//
//		Object m = container.getBean("myDate2");
//
//		System.out.println(m);
//注解方式@configuration
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Object m = ctx.getBean("myDate");
		System.out.println(m);



	}

	//DefaultListableBeanFactory
}
