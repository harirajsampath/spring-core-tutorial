package com.bita.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bita.training.model.Employee;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bita/training/bean.xml");
		Employee emp = ctx.getBean("constructorInjectObject", Employee.class);
		Employee emp1 = ctx.getBean("mary", Employee.class);
		Employee emp2 = ctx.getBean("john", Employee.class);
		Employee emp3 = ctx.getBean(Employee.class);
		System.out.println("First name of employee: " + emp.firstName);
		System.out.println("First name of employee: " + emp1.firstName);
		System.out.println("First name of employee: " + emp2.firstName);
		System.out.println("First name of employee: " + emp3.firstName);
		emp.getAddress();
	}
}
