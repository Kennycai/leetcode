package twoSum_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {
    @Test
    public void TwoSumTest() {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(Arrays.toString(answer));

    }
}
