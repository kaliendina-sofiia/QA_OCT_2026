 package org.prog.session4;

import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
//        int[] ints = new int[1000];
//        Random random = new Random();
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = random.nextInt(1000);
        //      }
        int[] index = new int[5];
        index[0] = 5;
        index[1] = 4;
        index[2] = 3;
        index[3] = 2;
        index[4] = 1;


            boolean stopped = true;
            while (stopped) {
                stopped = true;
        for (int i = 0; i < index.length -1 ; i++ ) {

            if (index[i - 1] > index[i]) {
                int previousNumber = index[i - 1];
                int number = index[i];
                index[i - 1] = number;
                index[i] = previousNumber;
                stopped = false;


        }}}

                 System.out.println(index[i]);
      //      System.out.println(i + " " + index[i]);


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

