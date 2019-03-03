package Sort;

import Sort.impl.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortTest {
    @Test
    public void test () {
        int [] list = {4, 5, 6, 1, 3, 2};
        Sort sort = new QuickSort();
        list = sort.sort(list);
        System.out.println(Arrays.toString(list));
        assert(Arrays.equals(list, new int[] {1, 2, 3, 4, 5, 6}));
    }
}
