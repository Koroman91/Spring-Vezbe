package org.korolija.javabrains;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;





public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

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
	
	System.out.println(this.getMessageSource().getMessage("drawing.circle", null, "Default Drawing Message", null));
	System.out.println("Circle: Point is: (" + center.getX() + "," + center.getY()+")");
	//System.out.println(this.getMessageSource().getMessage("greeting", null, "Default Greeting", null));
	DrawEvent drawEvent = new DrawEvent(this);
	drawEvent.publishEvent(drawEvent);
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

public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
	this.publisher = publisher;
	
}
}