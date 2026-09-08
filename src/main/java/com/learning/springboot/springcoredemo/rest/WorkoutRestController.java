package com.learning.springboot.springcoredemo.rest;

import com.learning.springboot.springcoredemo.commons.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutRestController {
    private Coach coach, coach2;

//    Constructor injection example
    @Autowired
//    Use @Qualifier annotation when there are multiple bean dependencies with same type
    public WorkoutRestController(@Qualifier("trackCoach") Coach coach, @Qualifier("trackCoach") Coach coach2){
//    public WorkoutRestController(Coach coach){
        System.out.println("In Constructor : " + getClass().getSimpleName());
        this.coach = coach;
        this.coach2 = coach2;
    }


//    Setter Injection example
//    @Autowired
//    public void setCoach(Coach coach){
//        this.coach = coach;
//    }

    @GetMapping("/dailyworkout")
    String getDailyWorkout(){
        return  coach.getDailyWorkout();
    }

    @GetMapping("/check")
    String check(){
        return "coach == coach2 : " + (coach == coach2);
    }
}
