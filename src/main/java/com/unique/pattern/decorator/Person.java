package com.unique.pattern.decorator;

/**
 * 装饰模式
 * Created by lin on 2017/8/30.
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {

        this.name = name;
    }

    public void show() {
        System.out.println("perosn normal show");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
