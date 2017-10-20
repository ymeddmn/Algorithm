package com.mage.fengwang;

/**
 * 算法
 * <p>
 * 用一块钱去买桃，一毛钱一个，活动一，没买两个送一个，活动二，三个桃核换一个，两种活动可以共享，问能有多少个桃，用递归
 */
public class TaoAlgorighm {
    private int money = 10;//总金额
    private int remainMoney=money;
    private int peahNum;//最终可以买的桃子数量
    private int currentPeah;//计算过程中手里桃子的数量，不超过三个

    public void buyPeah() {
        if (remainMoney > 0) {//金钱大禹0，用钱买
            currentPeah++;//当前的手里的桃字+1,
            remainMoney--;//金钱-1
            peahNum++;//总桃子数量+1
            buyPeah();//再买
        } else if (remainMoney == 0) {//如果金钱刚好==0，加上赠送的桃子
            currentPeah += peahNum / 2;//
            peahNum = peahNum + peahNum / 2;
            remainMoney--;
            buyPeah();
        } else {//如果小于0，计算桃核送的桃子
            if (currentPeah >= 3) {
                peahNum += currentPeah / 3;
                currentPeah = currentPeah / 3 + currentPeah % 3;
                buyPeah();
            } else {
                System.out.println(money / 10 + "元可买桃子" + peahNum);
                return;
            }
        }

    }

    public static void main(String[] args) {
        TaoAlgorighm a = new TaoAlgorighm();
        a.buyPeah();
    }

}
