package leetcode.editor.cn._0198Rob;

/**
 * 動態規劃算法
 * 第n個房子的最大金額分為兩種情況：dp[k] = max(dp[i - 2] + nums[i], dp[i - 1])
 * 1. 偷第n個房子，max = 第n個房子的金額加上第n-2個房子的最大金額
 * 2. 不偷第n個房子，max = 第n-1個房子的最大金額
 * *因為只需要用到 n-2 和 n-1 的數據，所以只需要創建pre和cur即可
 * 時間複雜度：O(N)
 * 空間複雜度：O(1)
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int pre = nums[0], cur = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = Math.max(pre + nums[i], cur);
            pre = cur;
            cur = temp;
        }
        return cur;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{3, 2, 2}));
    }
}
