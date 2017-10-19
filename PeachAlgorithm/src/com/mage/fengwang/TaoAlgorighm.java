package com.mage.fengwang;

/**
 * 算法
 * <p>
 * 用一块钱去买桃，一毛钱一个，活动一，没买两个送一个，活动二，三个桃核换一个，两种活动可以共享，问能有多少个桃，用递归
 */
public class TaoAlgorighm {
    private int money = 10;//总金额
    private int peahNum;//最终可以买的桃子数量
    private int currentPeah;//计算过程中手里桃子的数量，不超过三个

    public int buyPeah() {
        if (currentPeah < 3 && money > 0) {//金钱大禹0，并且手里的桃子小与3的时候用钱去买桃子
            currentPeah++;
            peahNum++;
            money--;
            return buyPeah();
        } else if (currentPeah == 3) {//手里的桃子等于3的时候吃了桃子去换一个，钱不变
            currentPeah = 1;
            peahNum++;
            return buyPeah();
        } else {//钱没了，手里桃子也不够三个，返回可买的桃子数量
//            System.out.println("桃子的数量是" + peahNum);
            return peahNum;
        }

    }

    public static void main(String[] args) {
        TaoAlgorighm a = new TaoAlgorighm();
        int num = a.buyPeah();
        System.out.println("桃子的数量是" + num);
    }

}
