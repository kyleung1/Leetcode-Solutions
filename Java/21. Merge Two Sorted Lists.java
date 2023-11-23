package Java;

class Solution {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head_node = new ListNode(0); // holds the place of the head
        ListNode current_node = head_node;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                current_node.next = list1;
                list1 = list1.next;
            } else {
                current_node.next = list2;
                list2 = list2.next;
            }

            current_node = current_node.next;
        }

        if (list1 != null) {
            current_node.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            current_node.next = list2;
            list2 = list2.next;
        }

        return head_node.next;
        
    }
}