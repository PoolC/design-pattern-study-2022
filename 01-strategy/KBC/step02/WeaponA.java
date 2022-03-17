package com.vsfe.headfirstdesignpattern.item01.step02;

public class WeaponA extends Weapon {
    public WeaponA() {
        setName("응애");
        setWeaponTypes(new WeaponType[]{new Bow(), new Gun()});
    }
}
