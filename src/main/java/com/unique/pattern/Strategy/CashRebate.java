package com.unique.pattern.Strategy;

/**
 * 满减活动
 * Created by lin on 2017/8/29.
 */
public class CashRebate implements CashCommon {

    public double acceptCash(double money) {
        if (money > 100) {
            money = money * 0.7;
        }
        return money;
    }
}
