package com.mage.fengwang;

/**
 * 不通过中间变量交换两个数字
 */
public class SwapTwoData {
    public void swap(int a, int b) {
        System.out.println("输入数字为:" + a + "-" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("输出数字为:" + a + "-" + b);
    }

    public static void main(String[] args) {
        SwapTwoData a = new SwapTwoData();
        a.swap(2,3);
    }
}
