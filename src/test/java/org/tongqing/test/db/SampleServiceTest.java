package org.tongqing.test.db;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.persistence.EntityNotFoundException;
import java.util.Random;

/**
 * @author Tongqing Qiu.
 */
public class SampleServiceTest {
    private SampleService sampleService = new SampleService();
    private SampleDao sampleDao;

    @Before
    public void setUp() throws Exception {
        if(sampleDao == null) {
            sampleDao = Mockito.mock(SampleDao.class);
            sampleService.setSampleDao(sampleDao);
        }
    }


    @Test
    public void testSetSampleDao() throws Exception {

    }

    @Test
    public void testExistsNotFound() {
        Random random = new Random(System.currentTimeMillis());
        Long id = random.nextLong();

        Mockito.when(sampleDao.findByPrimaryKey(id)).thenThrow(new EntityNotFoundException());

        boolean result = sampleService.exists(id);

        Mockito.verify(sampleDao).findByPrimaryKey(id);

        Assert.assertFalse(result);
    }

    @Test
    public void testExists() throws Exception {
        Random random = new Random(System.currentTimeMillis());
        Long id = random.nextLong();

        Mockito.when(sampleDao.findByPrimaryKey(id)).thenReturn(new Sample());

        boolean result = sampleService.exists(id);

        Mockito.verify(sampleDao).findByPrimaryKey(id);

        Assert.assertTrue(result);
    }
}
