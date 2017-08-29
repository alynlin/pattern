package com.unique.pattern.Strategy;

/**
 * 策略模式上下文，封装算法实现，业务实现细节
 * Created by lin on 2017/8/29.
 */
public class CashContext {

    private static String NORMAL = "NORMAL";

    private static String REBATE = "REBATE";

    private CashCommon cashCommon;

    public CashContext(String type) {

        if (NORMAL.equals(type)) {
            this.cashCommon = new CashNormal();
        }
        if (REBATE.equals(type)) {
            this.cashCommon = new CashRebate();
        }
    }

    public double acceptCash(double money) {
        return cashCommon.acceptCash(money);
    }

}
