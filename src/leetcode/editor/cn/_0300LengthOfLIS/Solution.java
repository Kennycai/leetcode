package leetcode.editor.cn._0300LengthOfLIS;

import java.util.Arrays;

/**
 * 動態規劃
 * 時間複雜度：O(N^2)
 * 空間複雜度：O(N)
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int maxLen = 0;
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (maxLen < dp[i]) {
                maxLen = Math.max(maxLen, dp[i]);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
