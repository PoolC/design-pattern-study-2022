package com.vsfe.headfirstdesignpattern.item01.step00;

import lombok.Getter;
import lombok.Setter;

/**
 * Ver.0
 * attack() 메서드와 display() 메서드가 있고,
 * 이 클래스를 상속 받는 WeaponTypeGun, WeaponTypeSword, WeaponTypeWand, Weapon이 있다.
 *
 * <문제점>
 * - attack() 메서드가 같은 여러 클래스가 있어도, 코드의 내용을 줄이지 못 함.
 * -> 해결방법: attack() 메서드가 같은 클래스 끼리 묶기 위해 슈퍼 타입을 하나 더 만들고, 상속하자.
 */

@Getter
@Setter
public class Weapon {
    private String name;
    private int minimumLevel;

    public void attack() {
        System.out.println("Attack");
    }

    public void display() {
        System.out.println("Weapon.display");
    }
}
