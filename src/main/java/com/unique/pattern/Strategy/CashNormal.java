package com.unique.pattern.Strategy;

/**
 *
 * Created by lin on 2017/8/29.
 */
public class CashNormal implements CashCommon{

    public double acceptCash(double money) {
        return money;
    }
}
