package org.tongqing.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.tongqing.test.domain.Bar;
import org.tongqing.test.domain.Foo;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * @author Tongqing Qiu.
 */
@RunWith(MockitoJUnitRunner.class)
public class BDDTest {
    @Mock
    Bar bar;
    @InjectMocks
    Foo foo = new Foo();

    @Test
    public void simpleStub() throws Exception {
        given(bar.getName()).willReturn("foobar");

        //execute
        String result = bar.getName();

        assertThat(result, containsString("foo"));
    }

}
