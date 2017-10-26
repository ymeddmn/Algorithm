package com.mage.fengwang;

import java.util.Arrays;

/**
 * zigzag转化
 * <p>
 * <p>
 * 该字符串"PAYPALISHIRING"以一个Z字形模式写在给定行数上，如下所示：（您可能希望以固定字体显示此模式以获得更好的可读性）
 * <p>
 * PAHN
 * APLSIIG
 * 翊
 * 然后逐行阅读： "PAHNAPLSIIGYIR"
 * 编写将采用字符串的代码，并将此转换指定给多行：
 * <p>
 * string convert（string text，int nRows）;
 * convert("PAYPALISHIRING", 3)应该返回"PAHNAPLSIIGYIR"。
 */
public class ZigZagAlgorithm {
    public static void main(String[] args) {
        ZigZagAlgorithm z = new ZigZagAlgorithm();
        String zigzag = z.zigzag1("0123456789", 3);
        System.out.println(zigzag);
    }

    public String zigzag(String zigzag, int step) {
        String[] strArray = new String[step];
        Arrays.fill(strArray, "");
        int forStep = 2 * step - 2;//每个拐点包含的字符数量
        int length = zigzag.length() / step + zigzag.length() % step;//计算出拐点的数量
        for (int i = 0; i < length; i++) {//遍历拐点
            for (int j = 0; j < forStep; j++) {
                int index = j - step >= 0 ? step - 2 - (j - step) : j % step;//分别计算出向下和向上的拐点对应的索引 ，索引值为 0  ~  step-1
                int charIndex = i * forStep + j;//计算出当前点在字符串中的索引
                if (charIndex < zigzag.length()) {//如果索引小yu字符串的长度那么就复制给存储字符串的数组
                    strArray[index] += zigzag.charAt(charIndex) + "";
                }
            }
        }
        String finalStr = "";
        for (int i = 0; i < strArray.length; i++) {
            finalStr += strArray[i];
        }
        return finalStr;
    }

    /**
     * 这个算法的关键就是定义一个数组，遍历字符串添加到数组，最后吧数组合并为字符串
     *
     * @param s
     * @param numRows
     * @return
     */
    String zigzag1(String s, int numRows) {
        String finalStr = "";
        int index = 0;
        int step = 1;
        String arrarStr[] = new String[numRows];
        Arrays.fill(arrarStr, "");//初始化数组
        for (int i = 0; i < s.length(); i++) {
            arrarStr[index] += s.charAt(i) + "";
            index += step;
            if (index == 0) {//上边的拐点的话说明之后的趋势是乡下的索引就加1，
                step = 1;
            }
            if (index == numRows - 1) {//下面的拐点的话说明之后的趋势是向上的索引就减1
                step = -1;
            }
        }
        for (int i = 0; i < arrarStr.length; i++) {
            finalStr += arrarStr[i];
        }
        return finalStr;
    }
}
