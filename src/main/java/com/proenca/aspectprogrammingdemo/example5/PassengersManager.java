package com.proenca.aspectprogrammingdemo.example5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengersManager {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("example5/aop.xml");

        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        System.out.println(passengerDao.getPassenger(0));

        context.close();
    }
}
