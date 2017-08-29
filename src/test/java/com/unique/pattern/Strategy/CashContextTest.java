package com.unique.pattern.Strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 策略模式测试
 * Created by lin on 2017/8/29.
 */
public class CashContextTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAcceptCash() throws Exception {

        CashContext context = new CashContext("NORMAL");

        double money = context.acceptCash(200);

        System.out.println(money);

        context = new CashContext("REBATE");

        money = context.acceptCash(200);

        System.out.println(money);
    }
}