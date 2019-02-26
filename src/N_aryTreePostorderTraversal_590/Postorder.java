package N_aryTreePostorderTraversal_590;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * leetcode 590.N叉树的后序遍历
 *给定一个 N 叉树，返回其节点值的后序遍历。
 */
public class Postorder {
    /**
     * 递归实现版本
     */
    List<Integer> list = new ArrayList<>();//保存结果
    public List<Integer> postorder(Node root) {
        if (root == null)
            return list;
        //递归遍历每个孩子
        for (Node child : root.children) {
            postorder(child);
        }
        //将值加入数组
        list.add(root.val);
        return list;
    }

    /**
     * 遍历版本，栈实现
     * @param root
     * @return
     */
    public List<Integer> postorder_2 (Node root) {
        List<Integer> list = new ArrayList<>();//保存结果
        if (root == null)
            return list;
        Node currNode = root;//新建对象指向当前节点
        Node pre = null;//保存上一个出栈元素
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            currNode = stack.peek();
            /**
             * 在没有子节点的时候出栈；以及如果上个节点是当前节点的子节点时出栈
             */
            if ((currNode.children.size() == 0)||(pre != null && (currNode.children.contains(pre)))){
                list.add(currNode.val);
                /**
                 * 关键，保存上一个从栈中出来的节点，
                 * 以免造成当出栈到叶子节点的时候符合有子节点的情况而重新入栈，造成死循环
                 */
                pre = currNode;
                stack.pop();
            } else {
                for(int i = currNode.children.size()-1;i>=0;i--){
                    stack.push(currNode.children.get(i));
                }
            }
        }
        return list;
    }
}
