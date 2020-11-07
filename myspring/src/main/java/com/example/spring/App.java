package com.example.spring;


import com.example.spring.dto.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args ){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application.xml"));
		HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
	}

}
