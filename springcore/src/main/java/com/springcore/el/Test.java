package com.springcore.el;

import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/el/config.xml");
	Demo dem=context.getBean("demo",Demo.class);
	System.out.println(dem);

	}

}
