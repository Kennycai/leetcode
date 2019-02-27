package invertBinaryTree_226;

import org.junit.jupiter.api.Test;

public class invertTreeTest {
    @Test
    public void invertTreeTest () {
        TreeNode n0 = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);

        n0.left = n1;
        n1.left = n2;n1.right = n3;
        n2.left = n4;

        invertTree invertTree = new invertTree();
        TreeNode result = invertTree.invertTree(n0);
    }
}
