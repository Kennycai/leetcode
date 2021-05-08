package leetcode.editor.cn._0075SortColors;

import static leetcode.editor.cn.common.Utils.swap;

public class Solution {
    public void sortColors(int[] nums) {
        partition(nums, 0, nums.length - 1, 1);
    }

    /**
     * 思路：定义两个范围，一个为比num小的区域 less，一个为比num大的区域 more。
     * 当nums[index] 比 num 小的时候，替换 nums[index++], nums[++less]
     * 当nums[index] 比 num 大的时候，替换 nums[index], nums[--more]，由于替换过来的nums[--more]还没有进行比较，所以index不变
     * 否则index++
     * 返回的是等于num的值的区域(本道题没有使用到，快排中有使用到)
     */
    public int[] partition(int[] nums, int i, int j, int num) {
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
        Solution solution = new Solution();
        solution.sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}
