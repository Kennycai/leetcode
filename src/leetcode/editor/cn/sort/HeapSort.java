package leetcode.editor.cn.sort;

import static leetcode.editor.cn.common.Utils.swap;

/**
 * 堆排序
 * 1. 将数组形成大根堆，然后把根节点的数和最后一个数交换，这样最后一个数就是最大值
 * 2. 然后剩余部分再堆化，再将根节点和范围内的最后一个数交换，这样最后个数是有序的。
 * 3. 重复 2 步骤
 * 时间复杂度：O(NlogN)
 * 空间复杂度：O(1)
 */
public class HeapSort {
    public static int[] heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        // 形成大根堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        // ------------------------------------------
        // 到这里根节点的值是最大的，所以把最大的值和最后一个值交换，再将 --heapSize 范围内的数调整成大根堆（只需调整替换过来的根节点）
        // 这样根节点又会是最大值，重复操作，最终排序成功
        // 0位置上的数和最后一个数交换，再将范围内的数重新调整成大根堆
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        // 重复上个步骤
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
        return arr;
    }

    /**
     * 堆插入（形成大根堆的过程）
     *
     * @param arr   当前数组
     * @param index 当前待调整的位置
     */
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    /**
     * 堆化，调整任意一个index位置上的数值之后，重新形成大根堆
     *
     * @param arr      当前数组
     * @param index    调整位置
     * @param heapSize 堆大小
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = 2 * index + 1;
        while (left < heapSize) {
            int largestIndex = 2 * index + 2 < heapSize && arr[2 * index + 2] > arr[left]
                    ? 2 * index + 2
                    : left;
            largestIndex = arr[largestIndex] > arr[index] ? largestIndex : index;
            if (largestIndex == index) {
                break;
            }
            swap(arr, index, largestIndex);
            index = largestIndex;
            left = 2 * index + 1;
        }
    }
}
