package com.vsfe.headfirstdesignpattern.item01.step02;

import lombok.Getter;
import lombok.Setter;

/**
 * Ver.2
 * 이제 무기의 타입을 정의하기 위해 WeaponType 이라는 클래스를 추가로 만들었다.
 * 실제 무기는 WeaponType 타입의 인스턴스들을 배열로 갖는다.
 *
 * <문제점>
 * - 만약 무기 업그레이드 기능을 활용하여 "런타임" 도중 무기가 바뀐다면?
 * -> Setter를 추가하는 방법으로 대응...
 */

@Getter
@Setter
public class Weapon {
    private String name;
    private int minimumLevel;
    private WeaponType[] weaponTypes;

    public void attack() {
        for (WeaponType wt : weaponTypes) {
            String typeName = wt.getTypeName();
            System.out.println(typeName + "타입 공격!!");
        }
    }

    public void display() {
        System.out.println("Weapon.display");
    }
}
