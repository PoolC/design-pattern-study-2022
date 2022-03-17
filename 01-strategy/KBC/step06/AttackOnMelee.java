package com.vsfe.headfirstdesignpattern.item01.step06;

public class AttackOnMelee implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("AttackOnMelee.attack");
    }
}
