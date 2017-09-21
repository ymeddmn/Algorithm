package com.mage.fengwang;

public class Main {

    public static void main(String[] args) {
        int array[] = {10, 7, 10,4, 6, 8, 3, 45,45,  98};
        QuickSort.sort(array, 0, array.length - 1);
        for (int a : array) {
            System.out.println(a);
        }
    }
}
