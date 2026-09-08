package com.learning.springboot.springcoredemo.commons;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Initiates bean lazily or when required
//@Lazy

// Specifying bean scope
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // Bean lifecycle method annotation
    @PostConstruct
    void init(){
        System.out.println("Custom Bean initialization method called...." + getClass().getSimpleName());
    }

    // Bean lifecycle method annotation
    @PreDestroy
    void destroy(){
        System.out.println("Custom Bean destroy method called...." + getClass().getSimpleName());
    }
}
