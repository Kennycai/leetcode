package maximumDepthofBinaryTree_104;

import org.junit.jupiter.api.Test;

public class MaxDepthTest {
    @Test
    public void maxDepthTest () {
        //创建二叉树
        TreeNode n0 = new TreeNode(1);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(1);

        n0.left = n1;
        n1.left = n2;
        n2.left = n3;
        n1.right = n4;

        MaxDepth maxDepth = new MaxDepth();
        //打印结果
        System.out.println(maxDepth.maxDepth(n0));
        assert(maxDepth.maxDepth(n0) == 4);
    }
}
