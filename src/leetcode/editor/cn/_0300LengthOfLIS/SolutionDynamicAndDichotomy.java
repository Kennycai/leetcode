package leetcode.editor.cn._0300LengthOfLIS;

/**
 * 貪心算法（動態規劃） + 二分查找
 * 時間複雜度：O(NlogN)
 * 空間複雜度：O(N)
 */
public class SolutionDynamicAndDichotomy {
    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int[] tails = new int[nums.length];
        for (int num : nums) {
            int i = 0, j = res;
            while (i < j) {
                int m = (i + j) / 2;
                if (tails[m] < num) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            tails[i] = num;
            if (j == res) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SolutionDynamicAndDichotomy solution = new SolutionDynamicAndDichotomy();
        System.out.println(solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
