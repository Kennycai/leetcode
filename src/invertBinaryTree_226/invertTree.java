package invertBinaryTree_226;

/**
 * 翻转一棵二叉树。
 * 示例：
 * 输入：
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class invertTree {
    public TreeNode invertTree (TreeNode root) {
        if (root == null)
            return root;
        //交换左右子树
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        //递归翻转二叉树
        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);
        return root;
    }
}
