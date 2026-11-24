package org.prog.session4;

public class Apple implements IPhone{
    @Override
    public void call() {
        System.out.println("Apple call");

    }
    @Override
    public void unlock() {
        System.out.println("Apple unlock");

    }
}

