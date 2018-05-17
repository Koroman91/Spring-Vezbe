package com.korolija.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.korolija.model.Book;
import com.korolija.model.BookLibrary;

public class ClientTest {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		BookLibrary bookLibrary = ctx.getBean("bookLibrary", BookLibrary.class);
		
		List<Book> allbooks = bookLibrary.getAllBooks();
		for (Book book : allbooks) {
			System.out.println(book.getBookId()+"\t"+book.getBookName());
		}
		
		System.out.println("-----------------------");
		Book book = bookLibrary.getGetFirstBook();
		
		System.out.println(book.getBookId()+"\t"+book.getBookName());

		
	}

}
