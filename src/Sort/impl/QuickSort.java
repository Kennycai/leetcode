package Sort.impl;

import Sort.Sort;

/**
 * 快速排序
 * 将数组分为两个空间，一边是比中值小的，一边是比中值大的，依次递归，知道只有一个
 * T(n) = O(n * log(n))
 */
public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] list) {
        quickSort(list, 0, list.length - 1);
        return list;
    }

    private void quickSort(int[] list, int l, int r) {
        if (l >= r)
            return;
        int q = partition(list, l, r);//取中值位置
        quickSort(list, l, q - 1);
        quickSort(list, q + 1, r);
    }

    /**
     * 将数组划分为以中间值为分界，左小，右大
     * @param list
     * @param l
     * @param r
     * @return
     */
    private int partition(int[] list, int l, int r) {
        /**
         * pval 取最后一个值为中值
         * i 为中值位置
         */
        int pval = list[r], i = l;
        for (int j = i; j < r; j++) {
            if (list[j] < pval) {//当值小于中值时，交换位置，中值位置+1
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
            }
        }
        //将中值换到中值位
        int temp = list[i];
        list[i] = list[r];
        list[r] = temp;
        return i;
    }
}
