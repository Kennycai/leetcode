package maximumDepthofBinaryTree_104;

/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */
public class MaxDepth {
    public int maxDepth (TreeNode root) {
        if (root == null)
            return 0;
        else
            return (Math.max(maxDepth(root.left), maxDepth(root.right))) + 1;
    }
}
