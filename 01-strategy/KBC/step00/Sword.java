package com.vsfe.headfirstdesignpattern.item01.step00;

public class Sword extends Weapon {
    @Override
    public void attack() {
        System.out.println("칼 휙휙");
    }

    @Override
    public void display() {
        System.out.println("WeaponTypeSword.display");
    }
}
