package com.unique.pattern.simplefactory;

/**
 * 简单工厂模式
 * Created by lin on 2017/8/29.
 */
public class SimpleOperationFactory {

    /**
     * 根据操作类型，实例化对应的操作类
     * @param operate 操作类型
     * @return 操作结果
     */
    public static Operation createOperation(char operate) {

        switch (operate) {
            case '+':
                return new OperationAdd();
            case '-':
                return new OperationSub();

            default:
                return null;
        }

    }
}
