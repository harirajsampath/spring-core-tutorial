package com.bita.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bita.training.config.AppConfig;
import com.bita.training.model.Employee;

public class Application {

	public static void main(String[] args) {

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bita/training/bean.xml");
//		Employee emp = ctx.getBean("constructorInjectObject", Employee.class);
//		Employee emp1 = ctx.getBean("mary", Employee.class);
//		Employee maryDuope = ctx.getBean("mary", Employee.class);
//		Employee emp2 = ctx.getBean("john", Employee.class);
//		Employee johnDuope = ctx.getBean("john", Employee.class);
//		Employee johnDuplicate = ctx.getBean("john", Employee.class);
//		int a = 10;
//		Employee emp3 = ctx.getBean(Employee.class);
		
//		System.out.println("Name of Employee:" + emp1.firstName);
//		System.out.println("Hashcode of Employee:" + emp1.hashCode());
//		
//		System.out.println("Name of Employee:" + maryDuope.firstName);
//		System.out.println("Hashcode of Employee:" + maryDuope.hashCode());
//		
//		System.out.println("Name of Employee:" + emp2.firstName);
//		System.out.println("Hashcode of Employee:" + emp2.hashCode());
//		
//		System.out.println("Name of Employee:" + johnDuope.firstName);
//		System.out.println("Hashcode of Employee:" + johnDuope.hashCode());
//
//		System.out.println("Name ojf Employee:" + johnDuplicate.firstName);
//		System.out.println("Hashcode of Employee:" + johnDuplicate.hashCode());

//		System.out.println("Street of John" + emp2.address.street);
//		System.out.println("Street of John" + emp2.address.street);
		
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext)ctx).scan("com.bita.training");
		((AnnotationConfigApplicationContext)ctx).refresh();
		AppConfig appConfig = ctx.getBean(AppConfig.class);
//		Employee john = ctx.getBean(Employee.class);
//		Employee anotherJohn = ctx.getBean(Employee.class);
//		
//		System.out.println("Name of the employee:" + john.getFirstName());
//		System.out.println("Name of the employee:" + john.hashCode());
//		System.out.println("Name of the employee:" + anotherJohn.hashCode());
		System.out.println("Name of the application:" + appConfig.getAppName());
		
	}
}
