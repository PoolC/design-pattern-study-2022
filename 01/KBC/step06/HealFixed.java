package com.vsfe.headfirstdesignpattern.item01.step06;

public class HealFixed implements HealStrategy {
    @Override
    public void heal() {
        System.out.println("FixedHeal.heal");
    }
}
