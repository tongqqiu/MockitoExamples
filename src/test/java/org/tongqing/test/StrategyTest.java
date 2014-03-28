package org.tongqing.test;

import org.junit.Before;
import org.junit.Test;
import org.tongqing.test.strategy.IStrategy;
import org.tongqing.test.strategy.Strategy;

/**
 * Test Strategy
 *
 * @author Tongqing Qiu
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
