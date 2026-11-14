 package org.prog.session4;

import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        int[] ints = new int[1000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000);
        }
        // 4,5,2,3,1

        for (int i = 0; i < ints.length;) {
           i++;

            if (ints[i] < ints[i + 1]) {
                int currentValue = ints[i];
                int nextValue = ints[i + 1];
                ints[i] = nextValue;
                ints[i + 1] = currentValue;
            } else {
                i++;
            }}

        }
    }

