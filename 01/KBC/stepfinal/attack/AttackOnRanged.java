package com.vsfe.headfirstdesignpattern.item01.stepfinal.attack;

public class AttackOnRanged implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("AttackOnRanged.attack");
    }
}
