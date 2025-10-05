package Homework.DynamicArray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 1; i <= 15; i++) {
            da.add(i * 10);
        }
        da.print();

        System.out.println("Index 0 -> " + da.getByIndex(0));
        System.out.println("Index 5 -> " + da.getByIndex(5));
        System.out.println("Index 20 -> " + da.getByIndex(20));
    }
}
