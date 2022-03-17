package com.vsfe.headfirstdesignpattern.item01.stepfinal;

import com.vsfe.headfirstdesignpattern.item01.stepfinal.butcher.ButcherCannot;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.attack.AttackOnMelee;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.heal.HealCannot;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.reload.ReloadCannot;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.weapontype.WeaponType;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.weapontype.WeaponTypeGun;
import com.vsfe.headfirstdesignpattern.item01.stepfinal.weapontype.WeaponTypeSword;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// 빌더 패턴을 사용하면 좀 더 잘 만들 수 있겠지만...
public class WeaponA extends Weapon {
    public WeaponA() {
        super("Weapon", 10, new WeaponType[]{new WeaponTypeGun(), new WeaponTypeSword()}, new AttackOnMelee(), new HealCannot(), new ReloadCannot(), new ButcherCannot());
    }
}
