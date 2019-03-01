package BinaryTreeLevelOrderTraversal_II_107;

import org.junit.jupiter.api.Test;

public class LevelOrderBottomTest {
    @Test
    public void test () {
        TreeNode node = new TreeNode(1);
        LevelOrderBottom levelOrderBottom = new LevelOrderBottom();
        System.out.println(new LevelOrderBottom().levelOrderBottom(node));
    }
}
