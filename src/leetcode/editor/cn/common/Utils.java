package leetcode.editor.cn.common;

public class Utils {
    /**
     * 数组中位置 i 、位置 j 数值交换
     * @param nums 数组
     * @param i 交换下标
     * @param j 交换下标
     */
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
