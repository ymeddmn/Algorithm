package com.mage.fengwang;

public class PeachAlgorithm {
    public static void main(String[] args) {
        PeachAlgorithm p = new PeachAlgorithm();
        p.buyPeache();
        System.out.println(p.peacheCount);
    }

    private int money=10;
    public int peacheCount;
    private int innerPeachCount;

    public void buyPeache() {
        if (innerPeachCount <= 1 && money <= 0) {
            return;
        }
        if (money > 0) {
            peacheCount++;
            money--;
            innerPeachCount++;
            buyPeache();
        } else if (money == 0) {
            peacheCount += money / 2;
            money--;
            innerPeachCount += money / 2;
            buyPeache();
        } else {
            peacheCount += peacheCount / 2;
            innerPeachCount = peacheCount / 2;
            buyPeache();
        }
    }
}
