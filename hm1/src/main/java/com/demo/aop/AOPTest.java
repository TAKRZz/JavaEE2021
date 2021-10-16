package com.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AOPConfig.class);

		Test test = app.getBean(Test.class);

		System.out.println(test.getClass().getName());
		test.func1();
		test.func2();
		test.func3();
		test.func4();


		app.close();

	}
}
 