package com.vsfe.headfirstdesignpattern.item01.stepfinal.attack;

public class AttackOnMelee implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("AttackOnMelee.attack");
    }
}
