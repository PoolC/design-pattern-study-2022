package com.vsfe.headfirstdesignpattern.item01.step01;

// 상속 받아서 사용하는 클래스 X -> 타입처럼 사용
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
