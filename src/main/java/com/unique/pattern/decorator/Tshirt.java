package com.unique.pattern.decorator;

/**
 * Created by lin on 2017/8/30.
 */
public class Tshirt extends Finery {

    /**
     * 重写show方法，扩展此功能
     */
    @Override
    public void show() {
        super.show();
        System.out.println("Tshirt show");
    }

}
