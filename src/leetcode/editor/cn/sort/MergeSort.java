package leetcode.editor.cn.sort;

/**
 * 归并排序
 */
public class MergeSort {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        sortHandler(arr, 0, arr.length - 1);
        return arr;
    }

    public static void sortHandler(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        sortHandler(arr, left, mid);
        sortHandler(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] arr2 = new int[right - left + 1];
        int i = 0;
        int p1 = left, p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            arr2[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            arr2[i++] = arr[p1++];
        }
        while (p2 <= right) {
            arr2[i++] = arr[p2++];
        }
        for (i = 0; i < arr2.length; i++) {
            arr[left + i] = arr2[i];
        }
    }
}
