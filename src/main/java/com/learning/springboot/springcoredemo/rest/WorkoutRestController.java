package com.learning.springboot.springcoredemo.rest;

import com.learning.springboot.springcoredemo.commons.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutRestController {
    private Coach coach;

//    Constructor injection example
//    @Autowired
//    public WorkoutRestController(Coach coach){
//        this.coach = coach;
//    }


//    Setter Injection example
    @Autowired
    public void setCoach(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    String getDailyWorkout(){
        return  coach.getDailyWorkout();
    }
}
