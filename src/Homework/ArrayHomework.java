package Homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayHomework {

    public static void main(String[] args) {

        int[] nums1 = {1, 6, 3, 6, 8, 2, 6, 2, 4, 7};
        int n = 6;
        int count = 0;
        for (int j : nums1) {
            if (j == n) {
                count++;
            }
        }
        System.out.println(" The number " + n + " appears " + count + " times in the array ");

        System.out.println("--------------------");

        int[] nums2 = {1, 5, 3, 4, 8, 3, 9, 6, 4, 5};
        System.out.println("Original array: " + Arrays.toString(nums2));
        for (int i = 0; i < nums2.length / 2; i++) {
            int temp = nums2[i];
            nums2[i] = nums2[nums2.length - i - 1];
            nums2[nums2.length - i - 1] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(nums2));

        System.out.println("--------------------");

        int[] nums3 = {1, 5, 3, 4, 8, 3, 9, 6, 4, 5};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums3) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int repeated = 0;
        for (int value : freq.values()) {
            if (value > 1) {
                repeated++;
            }
        }
        System.out.println("Number of repeated numbers: " + repeated);

        System.out.println("--------------------");

        String[] chars = {" Ե", "ս", "ի", "մ", "ա", "ն", "ու", "շ", "Հ", "ա", "յ", "ա", "ս", "տ", "ա", "ն", "ի" };
        String vowels = "աուիէօեոըև";
        int vowelCount = 0;
        for (String c : chars) {
            if (vowels.contains(c)) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
}

