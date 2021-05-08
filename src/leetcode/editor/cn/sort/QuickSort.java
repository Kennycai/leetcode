package leetcode.editor.cn.sort;

import java.util.Arrays;

import static leetcode.editor.cn.common.Utils.swap;

public class QuickSort {
    public static int[] sort(int[] nums) {
        sortHelp2(nums, 0, nums.length - 1);
        return nums;
    }

    /**
     * 标准快排
     */
    private static void sortHelp(int[] nums, int left, int right) {
        if (left < right) {
            int[] limit = partition(nums, left, right);
            sortHelp(nums, left, limit[0] - 1);
            sortHelp(nums, limit[1] + 1, right);
        }
    }

    /**
     * 随机快排
     * 时间复杂度O(N*logN)
     * 空间负责度O(logN)
     */
    private static void sortHelp2(int[] nums, int left, int right) {
        if (left < right) {
            // 随机范围内的一个数与最后一个数做交换，达到随机选取标准值的目的
            swap(nums, left + (int) (Math.random() * (right - left + 1)), right);
            int[] limit = partition(nums, left, right);
            sortHelp2(nums, left, limit[0] - 1);
            sortHelp2(nums, limit[1] + 1, right);
        }
    }

    /**
     * 思路：定义两个范围，一个标准值num（默认为范围内的最后一个数），一个为为比num小的区域 less，一个为比num大的区域 more。
     * 当nums[index] 比 num 小的时候，替换 nums[index++], nums[++less]
     * 当nums[index] 比 num 大的时候，替换 nums[index], nums[--more]，由于替换过来的nums[--more]还没有进行比较，所以index不变
     * 否则index++
     */
    public static int[] partition(int[] nums, int i, int j) {
        int num = nums[j];
        int less = i - 1, more = j + 1, index = i;
        while (index < more) {
            if (nums[index] < num) {
                swap(nums, ++less, index++);
            } else if (nums[index] > num) {
                swap(nums, --more, index);
            } else {
                index++;
            }
        }
        return new int[]{++less, --more};
    }

    public static void main(String[] args) {
        QuickSort solution = new QuickSort();
        int[] nums = {1, 0, 2, 1, 9, 0};
        solution.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
