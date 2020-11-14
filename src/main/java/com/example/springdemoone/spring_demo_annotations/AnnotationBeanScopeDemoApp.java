package com.example.springdemoone.spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring_demo_annotations/applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println("Pointing to the same object:" + (theCoach == alphaCoach));
        System.out.println(theCoach + " - "  + alphaCoach);

        //close the context
        context.close();
    }
}
