package Sort.impl;

import Sort.Sort;

/**
 * 选择排序
 * 将数组分为两边，一边已排序，已变为排序，每次选择最小的元素与已排序的最后一个元素进行交换
 * T(n) = O(n^2)
 * 原地排序，不稳定排序
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minSide = i;//保存最小元素位置
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minSide]) {
                    minSide = j;//修改为最小值下标
                }
            }
            /**
             * 交换
             */
            int temp = list[i];
            list[i] = list[minSide];
            list[minSide] = temp;
        }
        return list;
    }
}
