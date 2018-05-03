package com.korolija.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.korolija.spring.Poruka;

public class ClientTest {
	
	public static void main(String [] args)
	{
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Object object = beanFactory.getBean("message");
		if(object != null)
		{
			Poruka message = (Poruka)object;
			
			System.out.println(message.getMessageId()+"\t"+message.getMessage());
			
		}
		
		System.out.println("--------------------------------------------------");
		
		Poruka message = beanFactory.getBean("message", Poruka.class);
		
		
		System.out.println("--------------------------------------------------");
		
		String[] aliases = beanFactory.getAliases("message");
		
		for (String aName : aliases)
		{
			System.out.println(aName);
		}
		
		System.out.println("--------------------------------------------------");

		Poruka message2 = beanFactory.getBean(Poruka.class);
		System.out.println(message.getMessageId()+"\t"+message.getMessage());

		System.out.println("--------------------------------------------------");

		Class<?> cls = beanFactory.getType("message");
		System.out.println(cls.getName());
		
		System.out.println("--------------------------------------------------");

		System.out.println(beanFactory.isSingleton("message"));

	}

}
