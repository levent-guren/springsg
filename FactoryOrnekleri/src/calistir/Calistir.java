package calistir;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Calistir {
	public static void main(String[] args) {
		// xmlBeanFactory();
		applicationContext();
	}

	private static void applicationContext() {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("factory oluşturuldu");
		Araba araba = (Araba) factory.getBean("araba");
		System.out.println(araba);
		Araba araba2 = (Araba) factory.getBean("araba");
		System.out.println(araba2);
	}

	private static void xmlBeanFactory() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("beans.xml"));
		System.out.println("factory oluşturuldu");
		Araba araba = (Araba) factory.getBean("araba");
		System.out.println(araba);
		Araba araba2 = (Araba) factory.getBean("araba");
		System.out.println(araba2);
	}
}
