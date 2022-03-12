package com.vsfe.headfirstdesignpattern.item01.step06;

public class HealCannot implements HealStrategy {
    @Override
    public void heal() {
        System.out.println("CannotHeal.heal");
    }
}
