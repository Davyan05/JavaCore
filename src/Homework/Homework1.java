package Homework;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Homework1 {

    public static void main(String[] args) {
        int x = 5;
        int y = 13;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        if (x < y) {
            System.out.println("x is less than y");

            if (x == y) {
                System.out.println("x is equal to y");
            }
        }
        System.out.println("-------------");

        for (int i = 0; i <= 5; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        System.out.println("-------------");

        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("a + b =" + c);
        System.out.println("-------------");

        int n = 3;
        for (int i = 0; i < 10; i++) {
            int k = i + 1;
            System.out.println(n + " * " + k + " = " + (n * k));

        }
    }
}

