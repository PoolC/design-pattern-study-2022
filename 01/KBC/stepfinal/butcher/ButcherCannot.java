package com.vsfe.headfirstdesignpattern.item01.stepfinal.butcher;

public class ButcherCannot implements ButcherStrategy {
    @Override
    public void butcher() {
        System.out.println("ButcherCannot.butcher");
    }
}
