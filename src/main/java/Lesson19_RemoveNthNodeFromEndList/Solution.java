package Lesson19_RemoveNthNodeFromEndList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (size == 1) return null;
        temp = head;
        while (true) {
            size--;
            if (size == n) {
                ListNode temp2 = temp.next;
                if (temp2 != null)
                    temp.next = temp2.next;
                break;
            }
            temp = temp.next;
            if(size<n){
                return head.next;
            }

        }
        return head;
    }
}
