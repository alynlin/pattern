package com.unique.pattern.decorator;

/**
 * Created by lin on 2017/8/30.
 */
public class Jeans extends Finery {

    /**
     * 重写此方法，扩展功能
     */
    @Override
    public void show() {
        super.show();
        System.out.println("jeans show");
    }
}
