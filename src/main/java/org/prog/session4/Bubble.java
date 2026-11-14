 package org.prog.session4;

import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
//        int[] ints = new int[1000];
//        Random random = new Random();
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = random.nextInt(1000);
//        }
        int[] ints = new int[5];
        ints[0] = 5;
        ints[1] = 4;
        ints[2] = 3;
        ints[3] = 2;
        ints[4] = 1;

        for (int i = 0; i < ints.length-1 ; i++) {
                if (i == ints.length-1 ) {
                    i++;}
                if (i == 1){
                    i++;
                }


            boolean isSorted = true;
        while (!isSorted) {
            isSorted = false;
            for ( i = 1; i < ints.length -1; i++) {

                if (ints[i] < ints[i - 1]) {
                    int Value1 = ints[i];
                    int Value2 = ints[i - 1];
                    ints[i] = Value2;
                    ints[i - 1] = Value1;
                }
                }
                       isSorted = false;

       }

            System.out.println(ints[i]);

            }
    }}






        // 4,5,2,3,1
//        int start = 0;
//        int end = ints.length;
//        while (start < end) {
//            start++;
//            if (start == end) {
//               end = start;
//            }
//        }
//
//
//        for (int i = ints.length; i > 0;) {
//           i--;
//
//            if (ints[i] < ints[i + 1]) {
//                int currentValue = ints[i];
//                int nextValue = ints[i + 1];
//                ints[i] = nextValue;
//                ints[i + 1] = currentValue;
//            } else {
//                i++;
//            }}
//
//        }
//    }

