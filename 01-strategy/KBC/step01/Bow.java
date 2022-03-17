package com.vsfe.headfirstdesignpattern.item01.step01;

public class Bow extends Weapon {
    @Override
    public void attack() {
        System.out.println("활 솩솩");
    }

    @Override
    public void display() {
        System.out.println("WeaponTypeBow.display");
    }
}
