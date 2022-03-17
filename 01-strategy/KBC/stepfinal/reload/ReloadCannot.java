package com.vsfe.headfirstdesignpattern.item01.stepfinal.reload;

public class ReloadCannot implements ReloadStrategy {
    @Override
    public void reload() {
        System.out.println("ReloadCannot.reload");
    }
}
