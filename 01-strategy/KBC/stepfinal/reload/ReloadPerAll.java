package com.vsfe.headfirstdesignpattern.item01.stepfinal.reload;

public class ReloadPerAll implements ReloadStrategy {
    @Override
    public void reload() {
        System.out.println("ReloadPerAll.reload");
    }
}
