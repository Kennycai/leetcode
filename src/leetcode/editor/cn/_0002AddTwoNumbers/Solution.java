//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 4918 👎 0

package leetcode.editor.cn._0002AddTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result = 0, add1 = 0;
        ListNode resultNode = new ListNode(0);
        ListNode head = resultNode;
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        boolean hasNext = true;
        while (hasNext) {
            int resultTemp = add1;
            if (l1Temp != null) {
                resultTemp += l1Temp.val;
                l1Temp = l1Temp.next;
            }
            if (l2Temp != null) {
                resultTemp += l2Temp.val;
                l2Temp = l2Temp.next;
            }
            if (resultTemp >= 10) {
                resultTemp = resultTemp % 10;
                add1 = 1;
            } else {
                add1 = 0;
            }
            resultNode.val = resultTemp;
            hasNext = (l1Temp != null || l2Temp != null || add1 != 0);
            if (hasNext) {
                resultNode.next = new ListNode(0);
                resultNode = resultNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);
        solution.addTwoNumbers(l1, l2);
    }
}


