package org.tongqing.test.strategy;

/**
 * User: TQiu
 * Date: 1/7/14
 */
public class Strategy implements IStrategy {

    @Override
    public void doSomethingConcrete() {}

    @Override
    public boolean doValidate() {
        return false;
    }
}
