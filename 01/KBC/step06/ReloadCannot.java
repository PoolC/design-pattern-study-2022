package com.vsfe.headfirstdesignpattern.item01.step06;

public class ReloadCannot implements ReloadStrategy {
    @Override
    public void reload() {
        System.out.println("ReloadCannot.reload");
    }
}
