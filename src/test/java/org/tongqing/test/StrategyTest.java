package org.tongqing.test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by tongqingqiu on 1/10/14.
 */
public class StrategyTest {

    IStrategy strategy;

    @Before
    public void setUp() {
        strategy = new Strategy();
    }
    @Test
    public void testDoSomethingConcrete() throws Exception {
        strategy.doSomethingConcrete();

    }

    @Test
    public void testDoValidate() throws Exception {
        strategy.doValidate();
    }
}
