package com.learning.springboot.springcoredemo.commons;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Initiates bean lazily or when required
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
