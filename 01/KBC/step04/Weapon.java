package com.vsfe.headfirstdesignpattern.item01.step04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Ver.4
 * 이제 무기의 타입을 정의하기 위해 WeaponType 이라는 클래스를 추가로 만들었다.
 * 실제 무기는 WeaponType 타입의 인스턴스들을 배열로 가지며, Setter를 활용하여 중간에 타입을 변경할 수 있다.
 *
 * 또한, 각각의 무기는 타입에 따라 특정 동작들을 수행할 수 있는데, 해당 동작을 수행 가능한지에 대한 여부는
 * WeaponType 클래스에 정의되어 있고, 가능하다면 특정 동작을 수행한다.
 *
 * <문제점>
 * - 무기의 액션이 타입에 종속적이지 않게 된다면?? / 각 무기가 좀 더 세밀한 작업을 해야 한다면?
 * -> 결국, 속성을 분리하여 특정 행위로 정의하는게 최선으로 보인다.
 * -> 따라서, 인터페이스로 정의해서 상속받도록 해보자.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public void heal() {
        for (WeaponType wt : weaponTypes) {
            if (wt.isHealable()) {
                System.out.println("체력이 회복되었다!");
                return;
            }
        }

        System.out.println("이게 체력 회복도 안 되는게 까불어!");
    }


    public void butcher() {
        for (WeaponType wt : weaponTypes) {
            if (wt.isButcherable()) {
                System.out.println("고기를 도축했다!");
                return;
            }
        }

        System.out.println("지금 있는걸론... 무리...");
    }

    public void reload() {
        for (WeaponType wt : weaponTypes) {
            if (wt.isReloadable()) {
                System.out.println("재장전!");
                return;
            }
        }

        System.out.println("재장전도 안 되는 무기잖아...");
    }
}
