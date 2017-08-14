/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lab04
 */
//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach{
    
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
    
    public TennisCoach() {
        System.out.println("I am in constructor");
    }
    
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("Start here....");
    }

    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("End here....");
    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("i'm in setter method");
//        this.fortuneService = fortuneService;
//    }
    
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("i'm in crazy method");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
