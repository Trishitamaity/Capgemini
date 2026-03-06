package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Employee_Details.class);
    	Employee_Details employee = context.getBean(Employee_Details.class);
    	employee.Display_Employee_Details();
    }
}
