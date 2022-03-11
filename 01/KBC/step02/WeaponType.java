package com.vsfe.headfirstdesignpattern.item01.step02;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeaponType {
    private String typeName;

    public WeaponType(String typeName) {
        this.typeName = typeName;
    }
}
