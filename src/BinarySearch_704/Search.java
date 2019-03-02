package BinarySearch_704;

import org.junit.jupiter.api.Test;

/**
 * leetcode 704. 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 *
 * 示例 2:
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *
 * 提示：
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 */
public class Search {
    @Test
    public void test () {
        int[] a = {-1,0,3,5,9,12};
        Search s = new Search();
        System.out.println( s.search_trav(a, 2) );
    }

    /**
     * 递归版
     * @param nums
     * @param target
     * @return
     */
    public int search (int[] nums, int target) {
        if (nums == null)
            return -1;
        return healper(nums, 0, nums.length - 1, target);
    }
    public int healper (int[] nums, int start, int end, int target) {
        if (start > end || start == end) //递归结束出口之一
            return target == nums[start]? start : -1;
        if (target > nums[start] && target < nums[end] && (end - start) != 1) {
            int mid = (start + end)/2;
            return (target > nums[mid]) ? healper(nums, mid, end, target) : healper(nums, start, mid, target);
        } else {
            if (target == nums[start] || target == nums[end])
                return target == nums[start] ? start : end ;
            else return -1;
        }
    }

    /**
     * 非递归版本
     * @param nums
     * @param target
     * @return
     */
    public int search_trav (int[] nums, int target) {
        int start = 0, end = nums.length-1;
        if (nums == null || (target < nums[start] && target > nums[end]))
            return -1;
        while (start <= end) {
            if (target == nums[start] || target == nums[end])//判断是否有该值
                return nums[start] == target ? start : end;
            if (end - start == 1 ||  end - start == 0)
                return -1;
            //重新设置值可能在的区间
            int mid = (start + end)/2;
            if (target < nums[mid])
                end = mid;
            else
                start = mid;
        }
        return -1;
    }
}
