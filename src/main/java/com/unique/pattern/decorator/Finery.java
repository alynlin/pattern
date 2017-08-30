package com.unique.pattern.decorator;

/**
 * 服饰抽象类
 * Created by lin on 2017/8/30.
 */
abstract class Finery extends Person {

    public Person compoent;

    /**
     * 装饰方法,也可以使用构造函数注入，具体实现类似于文件流的操作
     *
     * @param compoent
     */
    public void decorate(Person compoent) {
        this.compoent = compoent;
    }

    @Override
    public void show() {
        if (compoent != null) {
            compoent.show();
        }
    }
}
