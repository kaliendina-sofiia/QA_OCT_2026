package org.prog.session4;

import org.prog.session7.object.Android;
import org.prog.session7.object.Apple;
import org.prog.session7.object.IPhone;

public class Main {
    public static void main(String[] args) {

        Android android = new Android();
        Apple apple = new Apple();
        phones(android);
        phones(apple);
    }

        public static void phones (IPhone phone ) {
            phone.call();
            phone.unlock();




    }
}
