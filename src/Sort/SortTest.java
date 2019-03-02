package Sort;

import Sort.impl.BubbleSort;
import Sort.impl.InsertionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortTest {
    @Test
    public void test () {
        int [] list = {4,5,6,1,3,2};
        Sort sort = new InsertionSort();
        assert(Arrays.equals(sort.sort(list), new int[] {1,2,3,4,5,6}));
        System.out.println(Arrays.toString(sort.sort(list)));
    }
}
