package calistir;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.AppConfig;
import bean.Araba;
import bean.Motosiklet;

public class Calistir {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Araba araba = (Araba) context.getBean("araba");
		System.out.println(araba);

		Motosiklet motosiklet = (Motosiklet) context.getBean(Motosiklet.class);
		System.out.println(motosiklet);
		context.close();
	}
}
