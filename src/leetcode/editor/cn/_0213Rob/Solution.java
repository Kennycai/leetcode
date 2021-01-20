package leetcode.editor.cn._0213Rob;

import java.util.Arrays;

/**
 * 動態規劃算法
 * 198的變形版本，環形房子可以分成兩種情況來解決：
 * 1. 一種是偷第一個不偷最後一個
 * 2. 一種是偷最後一個不偷第一個
 * 所有只需分別求出答案再選出其中的最大值即可。下面為198題的解題思路
 * 第n個房子的最大金額分為兩種情況：dp[k] = max(dp[i - 2] + nums[i], dp[i - 1])
 * 1. 偷第n個房子，max = 第n個房子的金額加上第n-2個房子的最大金額
 * 2. 不偷第n個房子，max = 第n-1個房子的最大金額
 * *因為只需要用到 n-2 和 n-1 的數據，所以只需要創建pre和cur即可
 * 時間複雜度：O(N)
 * 空間複雜度：O(1)
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
//        return Math.max(robHandler(Arrays.copyOfRange(nums, 0, nums.length - 1)),
//                robHandler(Arrays.copyOfRange(nums, 1, nums.length)));
        return Math.max(robHandler2(nums, 0, nums.length -1),
                robHandler2(nums, 1, nums.length));
    }

    public int robHandler(int[] nums) {
        int pre = 0, cur = 0;
        for (int num : nums) {
            int tem = Math.max(pre + num, cur);
            pre = cur;
            cur = tem;
        }
        return cur;
    }

    /**
     * 減少內存消耗版本，用start和end代替新建一個數組
     */
    public int robHandler2(int[] nums, int start, int end) {
        int pre = 0, cur = 0;
        for (int i = start; i < end; i++) {
            int tem = Math.max(pre + nums[i], cur);
            pre = cur;
            cur = tem;
        }
        return cur;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{2, 3, 2}));
    }
}
