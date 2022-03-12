package com.vsfe.headfirstdesignpattern.item01.stepfinal.heal;

public class HealCannot implements HealStrategy {
    @Override
    public void heal() {
        System.out.println("CannotHeal.heal");
    }
}
