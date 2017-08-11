/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Lab04
 */
//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach{
    
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
    
    public TennisCoach() {
        System.out.println("I am in constructor");
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
