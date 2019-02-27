package MaximumDepthofN_aryTree_559;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MaxDepthTest {
    @Test
    public void maxDepthTest () {
        List<Node> n1 = Arrays.asList(new Node(2, Arrays.asList(new Node(3, null)))
                , new Node(2, Arrays.asList(new Node(3, Arrays.asList(new Node(4, null))))));
        Node n0 = new Node(1, n1);

        MaxDepth max = new MaxDepth();
        System.out.println(max.maxDepth(n0));
    }
}
