package com.normal.test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by dylanyu on 12/3/2015.
 */
public class LargeDoubleDisplay {
    Double doubleVale = new Double("22222222222.22122222222");

    public void displayNormalDouble() {
        System.out.println("normal display:" + doubleVale);
    }

    public void displayFormatDouble() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(5);
        nf.setMinimumFractionDigits(10);
        System.out.println("formatted display:" + nf.format(doubleVale));
    }
}
