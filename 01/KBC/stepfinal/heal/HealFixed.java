package com.vsfe.headfirstdesignpattern.item01.stepfinal.heal;

public class HealFixed implements HealStrategy {
    @Override
    public void heal() {
        System.out.println("FixedHeal.heal");
    }
}
