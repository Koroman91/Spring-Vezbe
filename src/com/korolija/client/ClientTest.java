package com.korolija.client;



import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.info.CompanyInfo;
import com.korolija.model.Student;

public class ClientTest {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		CompanyInfo companyInfo = ctx.getBean("companyInfo", CompanyInfo.class);
        Map<Integer, String> empIdAndNameMap = companyInfo.getEmpIdAndNameMap();
		
       // empIdAndNameMap.entrySet();
        
        Set<Entry<Integer, String>> entrySet = empIdAndNameMap.entrySet();
        
        for(Entry<Integer, String> entry : entrySet)
        {
        	System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
        
        System.out.println("------------");
        
        Map<Integer, Student> studentIdMap = companyInfo.getStudentIdMap();
       // studentIdMap.entrySet();
        Set<Entry<Integer,Student>> entrySet2 = studentIdMap.entrySet();
        
        for(Entry<Integer, Student> entry : entrySet2)
        {
        	System.out.println(entry.getKey());
        	Student student = entry.getValue();
        	
        	System.out.println(student.getStudentId()+"\t"+student.getStudentName());
        }     
		
		((AbstractApplicationContext) ctx).close();

	}


}
