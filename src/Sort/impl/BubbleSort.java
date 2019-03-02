package Sort.impl;

import Sort.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 冒泡排序
 * T(n) = O(n^2)
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            boolean exchange = false;//提前退出循环的标志
            for (int j = 0; j < list.length - i - 1; j++) {
                if(list[j] > list[j + 1]) {
                    //交换
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    exchange = true;
                }
            }
            if (!exchange) break;
        }
        List<Integer> a = new ArrayList<>();
        return list;
    }
}
