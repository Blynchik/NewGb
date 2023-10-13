package org.example.paradigm.hw2;

public class HW2 {

    public static void main(String[] args) {
        HW2.mult(6);
    }
    public static void mult(Integer num) {
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num; k++) {
                System.out.printf("%d * %d = %d\n", i, k, i * k);
            }
        }
    }
}
