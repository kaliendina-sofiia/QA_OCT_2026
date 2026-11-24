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
        andr2.model = "andr1";
        apple.model = " apple1 ";
        apple2.model = " apple2 ";

        System.out.println(andr.color.equals(andr2.color));
        System.out.println(andr2.model.equals(andr2.model));
        System.out.println(apple.color.equals(andr2.color));
        System.out.println(apple2.model.equals(andr2.model));

    }

        public static void phones (IPhone phone ) {
            phone.call();
            phone.unlock();


    }
}
