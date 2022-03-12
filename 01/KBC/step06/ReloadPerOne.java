package com.vsfe.headfirstdesignpattern.item01.step06;

public class ReloadPerOne implements ReloadStrategy {
    @Override
    public void reload() {
        System.out.println("ReloadPerOne.reload");
    }
}
