package mergeTwoBinaryTrees_617;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x) {
        val = x;
    }


    public static boolean isEquals(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if(t1.val == t2.val)
            return isEquals(t1.left, t1.left) && isEquals(t1.right, t2.right);
        else
            return false;
    }

}
