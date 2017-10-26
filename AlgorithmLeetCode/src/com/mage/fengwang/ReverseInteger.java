package com.mage.fengwang;

/**
 * 翻转整数
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        long reverse = r.reverse(12340);
        System.out.println(reverse);
    }

    public long reverse(int data) {
        long tempData = data;
        String finalData = "";
        while (tempData % 10 >= 1 || finalData == "") {//如果字符串为 "" 个位数为0那么是第一次循环满足条件
            long wei = tempData % 10;
            tempData /= 10;
            if (finalData.length() == 0 && wei == 0) {//
            } else {
                finalData += wei;
            }
        }
        return Long.parseLong(finalData);
    }
}
