package com.vsfe.headfirstdesignpattern.item01.step01;

public class Sword extends Weapon {
    @Override
    public void attack() {
        System.out.println("์นผ ํํ");
    }

    @Override
    public void display() {
        System.out.println("WeaponTypeSword.display");
    }
}
