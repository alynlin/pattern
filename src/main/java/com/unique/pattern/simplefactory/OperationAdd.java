package com.unique.pattern.simplefactory;

/** 加法操作
 * Created by lin on 2017/8/29.
 */
public class OperationAdd extends Operation {

    @Override
    public double operation(double a, double b) {
        return a + b;
    }
}
