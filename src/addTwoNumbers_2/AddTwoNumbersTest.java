package addTwoNumbers_2;

import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    @Test
    public void test(){
        AddTwoNumbers object = new AddTwoNumbers();
        AddTwoNumbers.ListNode l1 = object.new ListNode(2), l2 = object.new ListNode(5);
        l1.next = object.new ListNode(4);
        l1.next.next = object.new ListNode(3);
        l2.next = object.new ListNode(6);
        l2.next.next = object.new ListNode(4);
        AddTwoNumbers.ListNode result = object.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}