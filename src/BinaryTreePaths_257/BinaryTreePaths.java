package BinaryTreePaths_257;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 输入:
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * 输出: ["1->2->5", "1->3"]
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List res = new ArrayList<String>();
        if (root == null)
            return res;
        String s = "";
        helper(res, root, s);
        return res;
    }

    public void helper (List<String> res, TreeNode root, String s) {
        s += root.val;
        if (root.left == null && root.right == null)
            res.add(s);
        s += "->";
        if (root.left != null)
            helper(res, root.left, s);
        if (root.right != null)
            helper(res, root.right, s);
    }
}
