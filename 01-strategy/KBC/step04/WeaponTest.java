package com.vsfe.headfirstdesignpattern.item01.step04;

public class WeaponTest {
    public static void main(String[] args) {
        Weapon weaponA = new WeaponA();
        Weapon weaponB = new WeaponB();

        weaponA.attack();
        weaponB.attack();

        System.out.println("-----------");

        weaponA.butcher();
        weaponB.heal();

        weaponB.setWeaponTypes(new WeaponType[]{new Gun(), new Sword(), new Bow(), new Wand()});

        weaponB.heal();
    }
}
