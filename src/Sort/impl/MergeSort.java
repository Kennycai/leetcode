package Sort.impl;

import Sort.Sort;
/**
 * 归并排序
 * 将数组拆分成一个个的小数组，将小数组进行排序合并
 * T(n) = O(n * log(n))
 */
public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] list) {
        return mergeSort(list, 0, list.length - 1);
    }

    //将数组拆分成一个个小数组（小区间）
    public int[] mergeSort(int[] array, int left, int right) {
        if (left == right) {
            return null;
        }
        int mid = (right + left) / 2;
        //全都在原有的数组上进行操作，不产生新的数组，节省内存空间
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, right, mid);//对小数组进行合并
        return array;
    }

    /**
     * 将两个数组合并成一个
     * @param array 原有数组
     * @param start 排序区间起点
     * @param end 排序区间终点
     * @param mid 排序区间中点，左右两边的都是已排序区间
     */
    public void merge(int[] array, int start, int end, int mid) {
        int l = start, r = mid + 1;//l：左区间起点；r：右区间起点
        int[] result = new int[end - start + 1];//保存已排序数组
        int p = 0;//result起点
        while (l <= mid && r <= end) {//对左右值进行比较
            result[p++] = array[l] < array[r] ? array[l++] : array[r++];
        }
        while (l <= mid) {//将左数组剩余的加入result，右数组同理
            result[p++] = array[l++];
        }
        while (r <= end) {
            result[p++] = array[r++];
        }
        for (int i: result) {
            array[start] = i;
            start ++;
        }
    }
}
