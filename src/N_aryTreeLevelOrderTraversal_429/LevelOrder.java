package N_aryTreeLevelOrderTraversal_429;

import java.util.*;

/**
 * leetcode 429. N叉树的层序遍历
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 * 例如，给定一个 3叉树 :
 *https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/narytreeexample.png
 * 返回其层序遍历:
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 * 说明:
 * 树的深度不会超过 1000。
 * 树的节点总数不会超过 5000。
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null)
            return null;
        List res = new ArrayList<ArrayList<Integer>>(1000);
        Queue<Node> queue = new LinkedList<>();//利用队列先进先出的特点，实现层序遍历
        ((LinkedList<Node>) queue).add(root);
        while (queue.size() > 0) {//利用队列先进先出的特点，实现层序遍历
            List<Integer> subList = new ArrayList<>();//保存子列
            int count = queue.size();//通过count，确定当前层元素个数
            while (count > 0) {//遍历当前层所有元素
                Node node = queue.poll();
                subList.add(node.val);
                for (Node child:
                     node.children) {//将子节点放入队列
                    ((LinkedList<Node>) queue).add(child);
                }
                count --;
            }
            res.add(subList);//将子列加入res
        }
        return res;
    }
}
