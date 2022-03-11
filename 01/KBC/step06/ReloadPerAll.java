package com.vsfe.headfirstdesignpattern.item01.step06;

public class ReloadPerAll implements ReloadStrategy {
    @Override
    public void reload() {
        System.out.println("ReloadPerAll.reload");
    }
}
