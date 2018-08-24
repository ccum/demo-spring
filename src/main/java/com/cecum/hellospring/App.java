package com.cecum.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext =
        		new ClassPathXmlApplicationContext("com/cecum/xml/bean.xml");
        
        Mundo m = (Mundo)appContext.getBean("mundo");
        System.out.println(m.getMensaje());
        
        ((ConfigurableApplicationContext)appContext).close();
    }
}
