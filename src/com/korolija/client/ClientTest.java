package com.korolija.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.info.OrgInfo;
import com.korolija.model.Student;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		OrgInfo orgInfo = ctx.getBean("orgInfo", OrgInfo.class);
		
		Student[] studArr = orgInfo.getStudArr();
		
		for (Student student: studArr)
		{
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail()+""+student.getGender());
		}
		
		System.out.println("---------------");
		
		List<Student> studList = orgInfo.getStudList();
		
		for (Student student: studList)
		{
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail()+""+student.getGender());
		}
		
		System.out.println("---------------");
		
        Set<Student> studSet = orgInfo.getStudSet();
		
		for (Student student: studSet)
		{
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail()+""+student.getGender());
		}
		
		
		((AbstractApplicationContext) ctx).close();

	}


}
