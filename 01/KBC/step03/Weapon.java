package com.vsfe.headfirstdesignpattern.item01.step03;

import lombok.Getter;
import lombok.Setter;

/**
 * Ver.3
 * 이제 무기의 타입을 정의하기 위해 WeaponType 이라는 클래스를 추가로 만들었다.
 * 실제 무기는 WeaponType 타입의 인스턴스들을 배열로 가지며, Setter를 활용하여 중간에 타입을 변경할 수 있다.
 *
 * <문제점>
 * - 각각의 무기가 공격기능 말고도 다른 기능이 있다면? (ex. 마법봉을 갖고 있다면 힐, 칼을 갖고 있다면 도축)
 * -> Weapon 클래스에 각각에 대한 메서드를 작성하고, 무기 타입 클래스가 상속 하면서 해당 메서드를 구현함.
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
