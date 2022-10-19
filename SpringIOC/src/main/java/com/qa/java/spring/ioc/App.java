package com.qa.java.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.java.spring.ioc.beans.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Customer mario = context.getBean("cust1", Customer.class);
    	
    	System.out.println(mario);
    	
    }
}
