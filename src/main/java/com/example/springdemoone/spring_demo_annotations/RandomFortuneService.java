package com.example.springdemoone.spring_demo_annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    String[] data = {
            "one",
            "two",
            "three"
    };

    @Override
    public String getFortune() {
        return data[new Random().nextInt(data.length)];
    }
}
