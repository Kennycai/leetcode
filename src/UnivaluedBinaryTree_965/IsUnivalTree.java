package UnivaluedBinaryTree_965;

/**
 * leetcode 965.单值二叉树
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 * 示例：
 * 输入：[2,2,2,5,2]
 * 输出：false
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 */
public class IsUnivalTree {
    int val = -1;//每个节点的值都是整数，范围为 [0, 99]
    int count = 0;
    public boolean isUnivalTree(TreeNode root) {
        count++;
        if (val == -1)
            val = root.val;
        else if (val != root.val)
            return false;
        else if (count>100)//给定树的节点数范围是 [1, 100]
            return true;

        if(root.left != null) {
            if (!isUnivalTree(root.left))//返回false，直接跳出循环
                return false;
        }
        if(root.right != null) {
            if (!isUnivalTree(root.right))//返回false，直接跳出循环
                return false;
        }
        return true;
    }
}
