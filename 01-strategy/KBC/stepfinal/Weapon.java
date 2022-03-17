package com.vsfe.headfirstdesignpattern.item01.stepfinal;

import com.vsfe.headfirstdesignpattern.item01.stepfinal.butcher.ButcherStrategy;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.attack.AttackStrategy;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.heal.HealStrategy;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.reload.ReloadStrategy;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.weapontype.WeaponType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Ver. Final
 * 이제 무기의 타입을 정의하기 위해 WeaponType 이라는 클래스를 추가로 만들었다.
 * 실제 무기는 WeaponType 타입의 인스턴스들을 배열로 가지며, Setter를 활용하여 중간에 타입을 변경할 수 있다.
 *
 * 또한, 각각의 무기는 타입에 따라 특정 동작들을 수행할 수 있는데,
 * 해당 동작을 수행 가능한지, 그리고 각각의 동작이 어떻게 이루어지는지는 인터페이스로 명시되어 있고,
 * 각 인터페이스를 구현한 구현체를 소유하고 있다.
 *
 * 이처럼, 각각의 동작을 동작의 모음으로 간주하지 않고, "알고리즘의 집합"으로 간주하는 것을 "Strategy Pattern" 이라고 부른다.
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Weapon {
    private String name;
    private int minimumLevel;
    private WeaponType[] weaponTypes;

    private AttackStrategy attackBehavior;
    private HealStrategy healBehavior;
    private ReloadStrategy reloadStrategy;
    private ButcherStrategy butcherStrategy;

    public void display() {
        System.out.println("Weapon.display");
    }
}
