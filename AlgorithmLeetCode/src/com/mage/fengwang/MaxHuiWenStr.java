package com.mage.fengwang;


/**
 * 求最大回文子字符串    实际上就是找对称的字符串
 * <p>
 * 给定一个字符串s，在s中找到最长的回文子字符串。您可以假设s的最大长度为1000。
 * <p>
 * 例：
 * <p>
 * 输入： “babad”
 * <p>
 * 输出： “bab”
 * <p>
 * 注意： “aba”也是一个有效的答案。
 * 例：
 * <p>
 * 输入： “cbbd”
 * <p>
 * 输出： “bb”
 */
public class MaxHuiWenStr {
    public static void main(String[] args) {
        MaxHuiWenStr m = new MaxHuiWenStr();
        String str = m.getHWStr("hhf");
        System.out.println(str);
    }

    public String getHWStr(String input) {
        String finalStr = "";
        for (int i = 0; i < input.length(); i++) {
            int left = i - 0;
            int right = input.length() - i;
            int min = left > right ? right : left;
            char chari = input.charAt(i);
            String currentStr = new String(new char[]{chari});
            for (int j = 0; j < min; j++) {
                if (input.charAt(i + j) == input.charAt(i - j) && j != 0) {
                    currentStr = input.charAt(i + j) + currentStr + input.charAt(i - j);
                } else {
                    if (currentStr.length() == 0 && input.charAt(i + j) == chari || input.charAt(i - j) == chari) {
                        currentStr = currentStr + chari;
                    }
                }
                if (currentStr.length() > finalStr.length()) {
                    finalStr = currentStr;
                }
            }
        }
        return finalStr;
    }
}
