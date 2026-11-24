package org.prog.session7.object;

public class Android implements IPhone {
    public String color;
    public String model;


    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void unlock() {
        System.out.println("Android unlock");

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Android) {
            Android andr = (Android) o;
            andr.color.equals(this.color);
            andr.model.equals(this.model);
        }
        return false;

    }

}


