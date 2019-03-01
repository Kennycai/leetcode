package BinaryTreeLevelOrderTraversal_II_107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * leetcode 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List res = new LinkedList<ArrayList<Integer>>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);
        while ( queue.size() > 0) {//利用队列先进先出的特点，实现层序遍历
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0; i --) {//通过i，确定当前层元素个数
                TreeNode node = ((LinkedList<TreeNode>) queue).poll();
                list.add(node.val);
                if (node.left != null) ((LinkedList<TreeNode>) queue).add(node.left);//添加左子树
                if (node.right != null) ((LinkedList<TreeNode>) queue).add(node.right);//添加右子树
            }
            ((LinkedList<List<Integer>>) res).addFirst(list);//向前插入列表
        }
        return res;
    }
}
