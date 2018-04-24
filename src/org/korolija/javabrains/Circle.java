package org.korolija.javabrains;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;


public class Circle implements Shape {
	
	private Point center;





public Point getCenter() {
	return center;
}

/*@Autowired
@Qualifier("circleRelated")*/
@Resource(name="pointC")
public void setCenter(Point center) {
	this.center = center;
}

public void draw() {
	System.out.println("Drawing Circle");
	System.out.println("Circle: Point is: (" + center.getX() + "," + center.getY()+")");
	
}
@PostConstruct
public void InitializeCircle()
{
	System.out.println("Init of Circle");
}
@PreDestroy
public void destroyCircle()
{
	System.out.println("Destroy of Circle");
}
}