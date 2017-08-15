/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Lab04
 */
@Configuration
//@ComponentScan("com.phantomdeveloper.springtest2")
public class SportConfig {
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
