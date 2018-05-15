package com.korolija.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Course;
import com.korolija.model.Student;

public class ClientTest {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

		Student student = ctx.getBean("student", Student.class);
		
		
		System.out.println(student.getName()+"\t"+student.getAge());
		
		System.out.println("-----------------");
		
		Course course = student.getCourse();
		
		System.out.println(course.getCourseName());
		
		((AbstractApplicationContext) ctx).close();
		
		
		
		
	}
	


}
