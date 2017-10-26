package com.mage.fengwang;

/**
 * 最大子串
 * 给定一个字符串，找到最长子串的长度，而不重复字符。
 * <p>
 * 例子：
 * <p>
 * 给定"abcabcbb"的答案是"abc"，长度是3。
 * <p>
 * 给定"bbbbb"的答案是"b"，长度为1。
 * <p>
 * 给定"pwwkew"的答案是"wke"，长度为3.请注意，答案必须是子字符串，"pwke"是子序列，而不是子字符串。
 */
public class LongestSubStringAlgorithm {
    public String check(String inputStr) {
        String maxStr = "";
        String tempStr = "";
        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            tempStr += c;
            for (int j = i + 1; j < inputStr.length(); j++) {

            }
        }
        return "s";
    }

    public static void main(String[] args) {
        LongestSubStringAlgorithm l = new LongestSubStringAlgorithm();
        l.check("asdafghklkjl");
    }

}
