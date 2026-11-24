package org.prog.session7.object;

public class Main {
    public static void main(String[] args) {

        Android andr = new Android();
        Android andr2 = new Android();
        Apple apple = new Apple();
        Apple apple2 = new Apple();

        phones(andr);
        phones(apple);


        andr.color = "pink";
        andr2.color = "green";
        apple.color = "red";
        apple2.color = "red";
        andr.model = "andr1";
        andr2.model = "andr2";
        apple.model = "apple2";
        apple2.model = "apple2";

        System.out.println(andr.equals(andr2));
        System.out.println(apple.equals(apple2));

    }

        public static void phones (IPhone phone ) {
            phone.call();
            phone.unlock();


    }
}
