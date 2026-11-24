package org.prog.session4;

public class Android implements IPhone {
    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void unlock() {
        System.out.println(  "Android unlock");

    }

}
