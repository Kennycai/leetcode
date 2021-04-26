package leetcode.editor.cn.sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] num1 = {7, 5,8, 9, 6, 11, 44};
        System.out.println(Arrays.toString(BubbleSort.sort(num1)));

        int[] num2 = {7, 5,8, 9, 6, 11, 44};
        System.out.println(Arrays.toString(SelectionSort.sort(num2)));

        int[] num3 = {7, 5,8, 9, 6, 11, 44};
        System.out.println(Arrays.toString(InsertSort.sort(num3)));

        int[] num4 = {7, 5,8, 9, 6, 11, 44};
        System.out.println(Arrays.toString(MergeSort.sort(num4)));
    }
}
