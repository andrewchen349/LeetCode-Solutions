/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //Check for null pointer
        if(head == null) return false;

        //Fast pointer move at twice the speed of slow, if there is a cycle, fast will eventually equal slow
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null && slow != null){
            if(fast == slow) return true;

            fast = fast.next.next;
            slow = slow.next;
        }
        return false;

    }
}
