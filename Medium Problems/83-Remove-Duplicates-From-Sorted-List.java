/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        //Edge Cases
        if(head == null || head.next == null){
            return head;
        }

        ListNode dum = new ListNode(0);
        ListNode fast = head;
        ListNode slow = dum;
        slow.next = fast;

        while( fast != null){
            //Move Pointer to End of Duplicates
            while(fast.next != null && fast.val == fast.next.val){
                fast = fast.next;
            }

            //Detect Duplicate
            if(slow.next != fast){
                slow.next = fast.next;
                fast = slow.next;
            }
            else{
                fast = fast.next;
                slow = slow.next;
            }
        }
        return dum.next;


    }
}
