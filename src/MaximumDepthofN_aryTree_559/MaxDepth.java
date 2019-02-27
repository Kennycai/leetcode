package MaximumDepthofN_aryTree_559;

/**
 * leetcode 559.N叉树的最大深度
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * 例如，给定一个 3叉树 :
 *https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/narytreeexample.png
 * 我们应返回其最大深度，3。
 */
public class MaxDepth {
    public int maxDepth(Node root) {
        Integer maxDepth =0;//最大深度
        if (root == null)
            return 0;
        if (root.children != null) {
            for (Node child : root.children) maxDepth = Math.max(maxDepth(child), maxDepth);
        }
        return ++maxDepth;//++要放在前面，不然会出错
    }
}
