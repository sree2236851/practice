package com.tcs.rowmapperwithxml;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDAOImpl studentDAOImpl = (StudentDAOImpl)context.getBean("studentDao");
        List<Student> allStudentDetails = studentDAOImpl.getAllStudentDetails();
        
        for (Student student : allStudentDetails) {
			System.out.println(student);
		}
        
    }
}
