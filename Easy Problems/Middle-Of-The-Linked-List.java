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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head; //Store original list
        int count = 0;  //Get length of length list
        while(head != null){
            count += 1;
            head = head.next;
        }

        head = temp; //set head back to original;
        int stop = count / 2;  //find middle length
        count = 0;

        //Traverse until middle
        while(head != null && count != stop){
            count += 1;
            head = head.next;
        }

        return head;

    }
}
