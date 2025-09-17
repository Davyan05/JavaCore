package Homework;

public class Homework2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        System.out.println("-------------");

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
            }
        System.out.println("-------------");

        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");


        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < (2 * i +1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5 - 2; i >= 0; i--) {
            for (int j = 5; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < (2 * i +1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
