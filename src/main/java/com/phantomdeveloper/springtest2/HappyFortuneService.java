/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest2;

import org.springframework.stereotype.Component;

/**
 *
 * @author Phantom
 */
@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today your Lucky Day";
    }
    
}
