package com.example.springdemoone.spring_demo_javaconfig;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
