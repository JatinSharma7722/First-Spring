package com.practice.firstSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.firstSpring.classes.*;
import com.practice.firstSpring.interfaces.*;

public class App 
{
    public static void main( String[] args )
    {
        Car myCar1 = new Corolla();
        System.out.println( myCar1.specs());
        
        Car myCar2 = new Swift();
        System.out.println( myCar2.specs());
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Car car1 = context.getBean("corolla",Car.class);
        System.out.println("By spring : "+car1.specs());
        Car car2 = context.getBean("swift",Car.class);
        System.out.println("By spring : "+car2.specs());
    }
}