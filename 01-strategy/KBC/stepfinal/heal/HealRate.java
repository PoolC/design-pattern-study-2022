package com.vsfe.headfirstdesignpattern.item01.stepfinal.heal;

public class HealRate implements HealStrategy {
    @Override
    public void heal() {
        System.out.println("RateHeal.heal");
    }
}
