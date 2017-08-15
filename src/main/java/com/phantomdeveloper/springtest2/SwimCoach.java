/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest2;

/**
 *
 * @author Lab04
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swimming for whole day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
