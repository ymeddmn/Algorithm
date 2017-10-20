package com.mage.fengwang;

/**
 * 给定一个整数数组，返回两个数字的索引，使它们相加到一个特定的目标。
 * <p>
 * 您可以假设每个输入都只有一个解决方案，而您可能不会使用相同的元素两次。
 * <p>
 * 例：
 * 给定nums = [2，7，11，15]，target = 9，
 * <p>
 * 因为nums [ 0 ] + nums [ 1 ] = 2 + 7 = 9，
 * 返回[ 0，1 ]。
 */
public class SumAlgorithm {
    public int[] getIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        SumAlgorithm s = new SumAlgorithm();
        int a[] = {1, 2, 34, 5, 6, 7, 8, 4, 2, 4, 6,};
        int target = 6;
        int[] sIndex = s.getIndex(a, target);
        System.out.println(sIndex[0]);
        System.out.println(sIndex[1]);

    }
}
