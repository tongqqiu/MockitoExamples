package org.tongqing.test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.tongqing.test.domain.Bar;
import org.tongqing.test.domain.Foo;

/**
 * @author Tongqing Qiu.
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {
    @Mock
    Bar bar;

    @Test
    public void simpleStub() {
        Foo foo = new Foo();
        foo.setBar(bar);
        when(bar.getName()).thenReturn("foobar");

        String result = bar.getName();

        assertThat(result, containsString("foo"));
    }

    @Test
    public void simpleVerify() {
        Foo foo = new Foo();
        foo.setBar(bar);
        foo.getBarName();

        verify(bar).getName();
    }

}
