package Sort.impl;

import Sort.Sort;

/**
 * 插入排序
 * 将数组一分为二，前面的是已排序好的，将后面的插入到已排序的数组中
 * T(n) = O(n^2)
 */
public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] list) {
        for (int i = 1; i < list.length; i++) {//从第二个开始遍历
            int now = list[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (now < list[j])
                    list[j+1] = list[j];//向后移
                else {
                    break;
                }
            }
            list[j + 1] = now;//插入
        }
        return list;
    }
}
