package com.learning.springboot.springcoredemo.commons;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Initiates bean lazily or when required
@Lazy
@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
