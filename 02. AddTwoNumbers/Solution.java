import java.util.List;

public class Solution {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));

        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 2 4 3 4 5
        // 5 6 4
        // 7 0 8 4 5
        ListNode result = new ListNode(0);
        ListNode current = result;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10;

            if (l1  != null) l1 = l1.next;
            if (l2  != null) l2 = l2.next;

            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return result.next;

    }

    
//      Definition for singly-linked list.
      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
