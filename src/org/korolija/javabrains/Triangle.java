package org.korolija.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Triangle implements Shape {
	

    public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	private Point pointA;
    private Point pointB;
    private Point pointC;
  

	public void draw()
	{
		System.out.println("Drawing Triangle");
		System.out.println("Point A = (" + getPointA().getX() + ", " +getPointA().getY() +")");
		System.out.println("Point B = (" + getPointB().getX() + ", " +getPointB().getY() +")");
		System.out.println("Point C = (" + getPointC().getX() + ", " +getPointC().getY() +")");
	}

/*	public void setApplicationContext(ApplicationContext context) 
			throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}
*/
/*	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is: " +beanName);
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean init method called for Triangle");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean destroy method called for Triangle");

	}

	
	public void myInit()
	{
		System.out.println("My init method called for Triangle");
	}
	
	public void cleanUp()
	{
		System.out.println("My cleanup method called for Triangle");

	}
	*/
	
}
