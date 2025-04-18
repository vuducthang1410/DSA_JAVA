package Lesson21_MergeTwoSortLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = dummy;
        ListNode head1 = list1;
        ListNode head2 = list2;
        while (head1 != null || head2 != null) {
            if (head1 == null) {
                head.val = head2.val;
                head2 = head2.next;
            } else if (head2 == null||head1.val < head2.val) {
                head.val = head1.val;
                head1 = head1.next;
            } else {
                head.val = head2.val;
                head2 = head2.next;
            }
            if (head1 != null || head2 != null) {
                head.next = new ListNode();
                head = head.next;
            }
        }
        return dummy;
    }
}
