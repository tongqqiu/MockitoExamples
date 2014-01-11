package org.tongqing.test.db;

import javax.persistence.EntityNotFoundException;

/**
 * @author Tongqing Qiu.
 */
public class SampleService {
    private SampleDao sampleDao;

    public void setSampleDao(SampleDao sampleDao) {
        this.sampleDao = sampleDao;
    }

    public boolean exists(Long id) {
        try {
            sampleDao.findByPrimaryKey(id);
        } catch(EntityNotFoundException e) {
            return false;
        }

        return true;
    }


}
