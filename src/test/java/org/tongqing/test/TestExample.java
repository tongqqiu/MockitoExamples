package org.tongqing.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Example of using mockito
 * User: TQiu
 * Date: 1/7/14
 */
@RunWith( MockitoJUnitRunner.class )
public class TestExample {

    @Mock
    Strategy strategy;

    Something objectUnderTest = new Something(strategy);

    @Before
    public void setUp() {
    }

    @Test
    public void testSomething() {
        objectUnderTest.doSomething();
        verify(strategy).doSomethingConcrete();
    }

    @Test
    public void testDelegateSomething() {
        when( strategy.doValidate() ).thenReturn( true );
        boolean isValid = objectUnderTest.validate();
        assertTrue( isValid );
    }

}
