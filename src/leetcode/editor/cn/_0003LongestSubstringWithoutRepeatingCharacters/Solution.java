//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4350 👎 0

package leetcode.editor.cn._0003LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kenny.cai
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s) || s == null) {
            return 0;
        }
        final String[] array = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int i = 0, j = 1, len = 0, i1;
        while (i < j) {
            for (i1 = i; i1 < array.length; i1++) {
                if (map.containsKey(array[i1])) {
                    i = map.get(array[i1]) + 1;
                    j = i1 + 1;
                    map.clear();
                    break;
                }
                len = Math.max(len, i1 - i + 1);
                map.put(array[i1], i1);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(" "));
    }
}
