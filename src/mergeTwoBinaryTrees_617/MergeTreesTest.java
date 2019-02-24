package mergeTwoBinaryTrees_617;

import org.junit.jupiter.api.Test;

public class MergeTreesTest {
    @Test
    public void mergeTreesTest () {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n0.left = n1;
        n1.left = n2;
        n2.left = n3;

        TreeNode nn0 = new TreeNode(2);
        TreeNode nn1 = new TreeNode(3);
        TreeNode nn2 = new TreeNode(4);
        nn0.right = nn1;
        nn1.left = nn2;

        MergeTrees merge = new MergeTrees();
        TreeNode result = merge.mergeTrees(n0, nn0);
    }
}
