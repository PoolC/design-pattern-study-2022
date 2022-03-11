package com.vsfe.headfirstdesignpattern.item01.step06;

public class HealRate implements HealStrategy {
    @Override
    public void heal() {
        System.out.println("RateHeal.heal");
    }
}
