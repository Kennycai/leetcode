package N_aryTreePreorderTraversal_589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Preorder {

    //递归实现版本
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null)
            return list;
        //将值加入数组
        list.add(root.val);
        //递归遍历每个孩子
        for (Node child : root.children) {
            preorder(child);
        }
        return list;
    }

    /**
     * 遍历版本，栈实现
     * @param root
     * @return
     */
    public List<Integer> preorder_2 (Node root) {
        List<Integer> list = new ArrayList<>();//保存结果
        if (root == null)
            return list;
        Node currNode = root;//新建对象指向当前节点
        Stack<Node> stack = new Stack<>();
        while (currNode != null) {
            list.add(currNode.val);
            if (currNode.children != null) {
                for (int i=currNode.children.size() - 1; i>=0; i--) {//前序遍历，反向压栈
                    stack.push(currNode.children.get(i));//将孩子节点压入栈
                }
            }
            if (stack.isEmpty() == true) currNode = null;
            else currNode = stack.pop();//取出栈顶结点赋值个当前节点
        }
        return list;
    }
}
