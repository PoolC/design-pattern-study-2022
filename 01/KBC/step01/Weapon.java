package com.vsfe.headfirstdesignpattern.item01.step01;

import lombok.Getter;
import lombok.Setter;

/**
 * Ver.1
 * attack() 메서드와 display() 메서드가 있고,
 * 이 클래스를 상속 받는 WeaponTypeGun, WeaponTypeSword, WeaponTypeWand, Weapon이 있다.
 *
 * 해당 클래스들을 슈퍼 타입으로 두고, 각각의 무기들은 해당 슈퍼 타입들을 상속해서 사용한다.
 *
 * <문제점>
 * - 두 개 이상의 타입이 공존하는 무기라면? (ex. 마법봉의 끝이 날카로워 근접 공격도 가능하다.)
 * -> 상속은 최대 1개의 슈퍼 타입만 받을 수 있음.
 * -> 따라서, 타입 클래스를 "상속" 하는 것이 아니라 "소유" (Composition) 하는 방법을 선택하자.
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
