package twoSum_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[]nums, int target) {
        Map<Integer,Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(maps.containsKey(complement))//判断map里面有没有补数，有则直接返回结果
                return new int[] {maps.get(complement), i};
            maps.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
