package com.vsfe.headfirstdesignpattern.item01.stepfinal.reload;

public class ReloadPerOne implements ReloadStrategy {
    @Override
    public void reload() {
        System.out.println("ReloadPerOne.reload");
    }
}
