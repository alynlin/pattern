package com.unique.pattern.simplefactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * SimpleOperationFactory Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>°ËÔÂ 29, 2017</pre>
 */
public class SimpleOperationFactoryTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: createOperation(String operate)
     */
    @Test
    public void testCreateOperation() throws Exception {

        Operation operation;

        operation = SimpleOperationFactory.createOperation('+');

        assert operation != null;
        double a = operation.operation(1, 1);

        System.out.println(a);
    }


} 
