/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public ListNode remove(ListNode head){
         if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }

        // Find the second last node
        ListNode second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;

        return head;
    }

    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }

        //ListNode tempHead = head;
        ListNode tail = head;

        //Find tail
        while( tail.next != null){
            tail = tail.next;
        }

        if(tail != head){
            if( tail.val != head.val){
                return false;
            }
            else{
                remove(head);
                return isPalindrome(head.next);
            }
        }

        return true;

    }
}
