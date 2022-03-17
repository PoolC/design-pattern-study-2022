package com.vsfe.headfirstdesignpattern.item01.step06;

public class ButcherCannot implements ButcherStrategy {
    @Override
    public void butcher() {
        System.out.println("ButcherCannot.butcher");
    }
}
