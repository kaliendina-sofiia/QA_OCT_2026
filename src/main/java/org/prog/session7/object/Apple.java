package org.prog.session7.object;

import java.util.Objects;

public class Apple implements IPhone {

    public String color;
    public String model;

    @Override
    public void call() {
        System.out.println("Apple call");

    }

    @Override
    public void unlock() {
        System.out.println("Apple unlock");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Apple) {
            Apple apple = (Apple) o;
            apple.color.equals(this.color);
            apple.model.equals(this.model);
            return apple.color.equals(this.color) && apple.model.equals(this.model);
        }
        return false;

    }
    @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }
}
