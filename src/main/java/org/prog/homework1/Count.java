package org. prog.homework1;

public class Count {

    public static void main(String[] args) {

//           int sum = 0;
        int counterAll = 0;
        int counterJ3 = 0;
        int counterJ7 = 0;
        int counterJ13 = 0;
        for (int i = 0; i < 100; i++) {
            int j3 = 3;

            int j7 = 7;

            int j13 = 13;

            if ((i % j3) == 0 && (i % j7) == 0 && (i % j13) == 0) {
                counterAll++;
            }
            if ((i % j3) == 0) {
                counterJ3++;
            }
            if ((i % j7) == 0) {
                counterJ7++;
            }
            if ((i % j13) == 0) {
                counterJ13++;
            }

        }
        System.out.println("counterAll = " + counterAll);
        System.out.println("counterJ3 =" + counterJ3);
        System.out.println("counterJ7 =" + counterJ7);
        System.out.println("counterJ13 =" + counterJ13);
//
//     if( (i % 3) == 0 && (i % 7) == 0 && (i % 13) == 0){
//      sum ++;
//}
//}System.out.println(sum);


    }
}