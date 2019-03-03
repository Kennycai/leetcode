package Sort;

/**
 * 排序接口
 * 概念：
 * 稳定排序:如果待排序的序列中存在值相等的元素，经过排序之后，相等元素之间原有的先后顺序不变
 * 原地排序算法:就是特指空间复杂度是O(1)的排序算法。
 */
public interface Sort {
   int[] sort (int[] list);
}
