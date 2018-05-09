package com.korolija.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.info.OrgInfo;

public class ClientTest {

	public static void main(String[] args) {
	
		
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
	OrgInfo orgInfo = ctx.getBean("orgInfo", OrgInfo.class);
	
	String[] namesArr = orgInfo.getNamesArr();
	
	for(String name: namesArr)
	{
		System.out.println(name);
	}
	
	System.out.println("-----------");
	
	List<String> empNameList = orgInfo.getEmpNameList();
	
	for(String name: empNameList)
	{
		System.out.println(name);
	}
	
	System.out.println("-----------");
	
	Set<Integer> empIdsSet = orgInfo.getEmpIdsSet();
	
	for(Integer id: empIdsSet)
	{
		System.out.println(id);
	}
	
	ctx.close();

	}

}
