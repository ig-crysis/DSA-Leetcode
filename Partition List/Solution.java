//LeetCode Problem 86 Partition List (Medium)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode greaterEqualHead = new ListNode(0);
        ListNode lessTail = lessHead;
        ListNode greaterEqualTail = greaterEqualHead;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                lessTail.next = curr;
                lessTail = lessTail.next;
            } else {
                greaterEqualTail.next = curr;
                greaterEqualTail = greaterEqualTail.next;
            }
            curr = curr.next;
        }
        greaterEqualTail.next = null;
        lessTail.next = greaterEqualHead.next;
        return lessHead.next;
    }
}
