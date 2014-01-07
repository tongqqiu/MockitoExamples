import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.tongqing.test.Something;
import org.tongqing.test.Strategy;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * User: TQiu
 * Date: 1/7/14
 */
@RunWith( MockitoJUnitRunner.class )
public class TestExample {

    @Mock
    Strategy strategy;

    Something objectUnderTest;

    @Before
    public void setUp() {
        objectUnderTest = new Something(strategy);
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
