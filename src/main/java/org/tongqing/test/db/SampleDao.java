package org.tongqing.test.db;

/**
 * @author Tongqing Qiu.
 */
public interface SampleDao   {
   Sample findByPrimaryKey(Long id);

    void update(Sample sample);
}
