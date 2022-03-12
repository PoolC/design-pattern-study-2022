package com.vsfe.headfirstdesignpattern.item01.step04;

public class WeaponA extends Weapon {
    public WeaponA() {
        super("WeaponA", 10, new WeaponType[]{new Gun(), new Sword()});
    }
}
