package com.korolija.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Student;
import com.korolija.model.StudentListAccessor;

public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentListAccessor studentListAccessor = ctx.getBean("studentListAccessor", StudentListAccessor.class);
		
		Student student = studentListAccessor.getThirdStudentInList();
		
		
		System.out.println("Third Student in the List:::");
		
		System.out.println(student.getName()+"\t"+student.getMarks());
		
		System.out.println("------------------------------");
		
		List<String> studentNames = studentListAccessor.getStudentNames();
		System.out.println("Name of Student in the list:");
		
		for(String name: studentNames)
		{
			System.out.println(name);
		}
		
		List<Student> failedStudents = studentListAccessor.getFailedStudents();
		System.out.println("Names of Student in the list::");
		
		for(Student student2: failedStudents)
		{
			System.out.println(student2.getName()+"\t"+student2.getMarks());

		
		ctx.close();
	   }
	}
}
