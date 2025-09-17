package Homework;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] x = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println("----------------------");

        System.out.println("First element:" + x[0]);

        System.out.println("----------------------");

        System.out.println("Last element:" + x[x.length - 1]);

        System.out.println("----------------------");

        System.out.println("length:" + x.length);

        System.out.println("----------------------");

        int min = x[0];
        for (int num : x) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min value:" + min);

        System.out.println("----------------------");

        if (x.length > 2) {
            int midIndex = x.length / 2;

            if (x.length / 2 * 2 != midIndex) {
                System.out.println("Middle element:" + x[midIndex]);

                System.out.println("----------------------");

                int evenCount = 0;
                for (int num : x) {
                    if (num / 2 * 2 == num) {
                        evenCount++;
                    }
                }
                System.out.println("Even count:" + evenCount);

                System.out.println("----------------------");

                int oddCount = 0;
                for (int num : x) {
                    if (num / 2 * 2 != num) {
                        oddCount++;
                    }
                }
                System.out.println("Odd count:" + oddCount);

                System.out.println("----------------------");

                int sum = 0;
                for (int num : x) {
                    sum += num;
                }
                System.out.println("Sum:" + sum);

                System.out.println("----------------------");

                double avg = 0;
                for (int num : x) {
                    avg += (double) num / x.length;
                }
                System.out.println("Avg:" + avg);
            }
        }
    }
}

