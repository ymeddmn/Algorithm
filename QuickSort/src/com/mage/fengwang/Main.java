package com.mage.fengwang;

public class Main {

    public static void main(String[] args) {
        int array[] = {2,3,1,8,1,4};
        QuickSort.sort(array, 0, array.length - 1);
        for (int a : array) {
            System.out.println(a);
        }
    }
}
