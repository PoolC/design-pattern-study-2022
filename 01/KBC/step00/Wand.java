package com.vsfe.headfirstdesignpattern.item01.step00;

public class Wand extends Weapon {
    @Override
    public void attack() {
        System.out.println("마법 확확");
    }

    @Override
    public void display() {
        System.out.println("WeaponTypeWand.display");
    }
}
