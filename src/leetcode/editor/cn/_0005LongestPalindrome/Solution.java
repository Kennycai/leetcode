package leetcode.editor.cn._0005LongestPalindrome;

/**
 * 暴力解法，遍歷每一串回文
 * 如果當前字符串小於最長回文長度可以直接跳過判斷
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int len = 0, left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if ((j - i > len) && checkIsPalindrome(s, i, j)) {
                    len = j - i;
                    left = i;
                    right = j;
                }
            }
        }
        return s.substring(left, right + 1);
    }

    private boolean checkIsPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("ac"));
    }
}
