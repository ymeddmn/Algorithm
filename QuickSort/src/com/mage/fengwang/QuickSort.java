package com.mage.fengwang;

/**
 * 快速排序
 */
public class QuickSort {
    public static void sort(int array[], int _left, int _right) {
        int left = _left;
        int right = _right;
        int temp = 0;
        if (left <= right) {
            temp = array[left];
            while (left != right) {
                while (right > left && array[right] >= temp) {
                    right--;
                }
                array[left] = array[right];
                while (right > left && array[left] <= temp) {
                    left++;
                }
                array[right] = array[left];
                array[left] = temp;
                sort(array, _left, left - 1);
                sort(array, right + 1, _right);
            }
        }
    }
}
