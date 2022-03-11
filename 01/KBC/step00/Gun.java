package com.vsfe.headfirstdesignpattern.item01.step00;

public class Gun extends Weapon {
    @Override
    public void attack() {
        System.out.println("총 빵빵");
    }

    @Override
    public void display() {
        System.out.println("WeaponTypeGun.display");
    }
}
