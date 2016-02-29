package com.test.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oe.dao.CustomerDao;
import com.oe.dto.Customers;

public class InsertTest {
public static void main(String[] args) {
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    CustomerDao service = ctx.getBean("customerDao", CustomerDao.class);
	    Customers e= service.getCustomerwithId(103);
	    System.out.println(e.getCUST_EMAIL());
}
}
