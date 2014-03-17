package org.tongqing.test.strategy;

/**
 * User: TQiu
 * Date: 1/7/14
 */
public class Something {
    IStrategy strategy;

    public Something(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething(){
        strategy.doSomethingConcrete();
    }

    public boolean validate() {
        return strategy.doValidate();
    }
}
