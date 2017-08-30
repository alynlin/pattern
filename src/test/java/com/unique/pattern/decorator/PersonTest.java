package com.unique.pattern.decorator;

import org.junit.Test;

/**
 * Created by lin on 2017/8/30.
 */
public class PersonTest {

    @Test
    public void testShow() throws Exception {

        Person person = new Person("unique");

        Tshirt tshirt = new Tshirt();
        Jeans jeans = new Jeans();

        tshirt.decorate(person);
        jeans.decorate(tshirt);

        jeans.show();
    }
}