package com.learning.springboot.springcoredemo.commons;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand valley";
    }
}
