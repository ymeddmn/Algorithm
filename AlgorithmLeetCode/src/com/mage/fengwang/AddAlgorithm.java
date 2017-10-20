package com.mage.fengwang;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 自己实现两个数字相加
 */
public class AddAlgorithm {
    public String add(int data1, int data2) {
        String str1 = String.valueOf(data1);
        String str2 = String.valueOf(data2);
        str1 = new StringBuilder(str1).reverse().toString();//倒叙输入的值
        str2 = new StringBuilder(str2).reverse().toString();
        List<Integer> a1 = getList(str1);//得到各位到最高位的数组
        List<Integer> a2 = getList(str2);

        int carry = 0;//相加时候的进位，默认为0
        int length1 = a1.size();
        int length2 = a2.size();
        int length = a1.size() > a2.size() ? a1.size() : a2.size();//那个数组的长度da用哪个做遍历
        String num = "";//最终结果字符串
        for (int i = 0; i < length; i++) {
            int a1Data;
            int a2Data;
            if (i < length1) {//如果这个位数上没有数字就补0
                a1Data = a1.get(i);
            } else {
                a1Data = 0;
            }
            if (i < length2) {
                a2Data = a2.get(i);
            } else {
                a2Data = 0;
            }

            if (a1Data + a2Data + carry >= 10) {//相加的结果如果大于10就进位1,否则不进位
                num = num + (a1Data + a2Data - 10 + carry);
                carry = 1;
            } else {
                num = num + (a1Data + a2Data + carry);
                carry = 0;
            }

            if (i == length - 1 && carry > 0) {//计算完成的时候如果还是有进位就补1
                num += "1";
            }
        }
        return new StringBuilder(num).reverse().toString();//倒置结果返回
    }

    private List<Integer> getList(String str) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            list.add(Integer.parseInt(new String(new char[]{s})));
        }
        return list;
    }


    public static void main(String[] args) {
        AddAlgorithm a = new AddAlgorithm();
        String add = a.add(1239, 1239);
        System.out.println(add);

    }


}
