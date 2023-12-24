package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo.config.xml");
     Student student= con.getBean("student",Student.class);
//     System.out.println(student);
//     System.out.println(student.getAddress());
//     System.out.println(student.getAddress().getClass().getName());
     Student student2=con.getBean("student",Student.class);
     System.out.println(student.hashCode());
     System.out.println(student2.hashCode());
     
    Teacher teacher= con.getBean("teacher",Teacher.class);
    Teacher teacher1= con.getBean("teacher",Teacher.class);
    
    System.out.println(teacher.hashCode());
    System.out.println(teacher1.hashCode());
    
	}

}
