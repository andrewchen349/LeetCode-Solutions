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
        if(head == null){
            return head;
        }

        if(head.next == null){
            return head;
        }

        //Create pointers
        ListNode slowPoint = head;
        ListNode fastPoint = head.next;

        while( slowPoint != null && slowPoint.next != null){
            if(slowPoint.val == fastPoint.val){
                slowPoint.next = slowPoint.next.next;
                fastPoint = fastPoint.next;
            }

            else{
                slowPoint = slowPoint.next;
                fastPoint = fastPoint.next;
            }
        }
        return head;

    }
}
