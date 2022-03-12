package com.vsfe.headfirstdesignpattern.item01.step06;

public class AttackOnRanged implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("AttackOnRanged.attack");
    }
}
