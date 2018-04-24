package org.korolija.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In After Intialization Method. Bean name is: " +beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In Before Intialization Method. Bean name is: " +beanName);
		return bean;
	}

}
