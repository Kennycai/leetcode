package leetcode.editor.cn._0005LongestPalindrome;

/**
 * 動態規劃：dp[i][j] = (s[i] == s[j]) and dp[i - 1][j + 1]
 * 核心思想：一個長的回文，那麼他的子串也一定是一個回文子串。
 * 注意事项：总是先得到小子串的回文判定，然后大子串才能参考小子串的判断结果，即填表顺序很重要。
 * 填表順序：
 *   0 1 2 3 4 5
 * 0 T 1 2 4 7 11
 * 1   T 3 5 8 12
 * 2     T 6 9 13
 * 3       T 1014
 * 4         T 15
 * 5           T
 */
public class SolutionDynamic {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        // 初始化二維數組，因為單個字符一定是回文串（也可以不用初始化，因為下面有判斷字符串長度小於3的情況）
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        int maxLen = 1, left = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    // 如果長度小於3，i = j就代表是回文，否則子串是回文就是回文
                    if (i - j < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i - 1][j + 1];
                    }
                } else {
                    dp[i][j] = false;
                }
                // 如果為true且大於maxLen，那麼就記錄其實節點和回文的長度即可
                if (dp[i][j] && i - j + 1 > maxLen) {
                    maxLen = i - j + 1;
                    left = j;
                }
            }
        }
        return s.substring(left, left + maxLen);
    }

    public static void main(String[] args) {
        SolutionDynamic solution = new SolutionDynamic();
        System.out.println(solution.longestPalindrome("c"));
    }
}
