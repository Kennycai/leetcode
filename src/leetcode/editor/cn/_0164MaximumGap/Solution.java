package leetcode.editor.cn._0164MaximumGap;

class Solution {
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE, max= Integer.MIN_VALUE;
        /**
         * 1. 遍历数组，找出数组中的最大值，最小值
         */
        for (int num : nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        /**
         * 2. 如果max == min 的话，那么间隔就是0
         */
        if (min == max) {
            return 0;
        }
        /**
         * 3. 创建三个数组长度为len + 1 的数组分别存放当前桶中是否有值，最大值，最小值
         */
        boolean[] hasNum = new boolean[len + 1];
        int[] mins = new int[len + 1];
        int[] maxs = new int[len + 1];

        /**
         * 4.
         * 遍历数组，确定桶的位置，然后再判断hasNum[index]是否为true，没有值的话直接赋值mins， maxs
         * 否则比较min、max的值，放入最小值、最大值，将hasNum[index]设为true
         */
        for (int num : nums) {
            int bucket = bucket(num, len, min, max);
            mins[bucket] = hasNum[bucket] ? Math.min(mins[bucket], num) : num;
            maxs[bucket] = hasNum[bucket] ? Math.max(maxs[bucket], num) : num;
            hasNum[bucket] = true;
        }

        /**
         * 5.
         * res：当前最大间隔
         * lastMax：最后一个非空桶内的最大值
         * 再遍历一边数组，将前一个非空桶的最大值与后一个非空桶的最小值相减，得到的就是间隔值（最大间隔就在其中）
         * 用全局变量res记录最大间隔
         */
        int res = 0, lastMax = maxs[0];
        for (int i = 0; i < len + 1; i++) {
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    public static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumGap(new int[]{1,1}));
    }
}