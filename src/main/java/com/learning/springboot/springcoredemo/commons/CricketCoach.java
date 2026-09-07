package com.learning.springboot.springcoredemo.commons;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// @Primary annotation used when there are multiple implementations of the same class
@Primary
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
