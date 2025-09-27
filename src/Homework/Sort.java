package Homework;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] array = new int[]{8, 9, 4, 67, 10, 91, 74, 33};

        Arrays.sort(array);

        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
