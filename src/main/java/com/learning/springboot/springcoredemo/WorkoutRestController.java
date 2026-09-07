package com.learning.springboot.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutRestController {
    private Coach coach;

    @Autowired
    public WorkoutRestController(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    String getDailyWorkout(){
        return  coach.getDailyWorkout();
    }
}
