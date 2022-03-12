package com.vsfe.headfirstdesignpattern.item01.step04;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeaponType {
    private String typeName;
    private boolean healable;
    private boolean butcherable;
    private boolean reloadable;

    public WeaponType(String typeName, boolean healable, boolean butcherable, boolean reloadable) {
        this.typeName = typeName;
        this.healable = healable;
        this.butcherable = butcherable;
        this.reloadable = reloadable;
    }
}
