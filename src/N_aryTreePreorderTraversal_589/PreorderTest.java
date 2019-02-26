package N_aryTreePreorderTraversal_589;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PreorderTest {
    @Test
    public void preorderTest () {
        Preorder preorder = new Preorder();
        System.out.println(preorder.preorder(null));
        assert (preorder.preorder(null).equals(new ArrayList<>()));
    }
}
