/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //Edge Cases

        //Empty LinkedList
        if(head == null){
            return head;
        }
        //LinkedList with one node
        if(head.next == null){
            if(head.val == val){
                head = null;
                return head;
            }
            return head;
        }

        //Trim away consec vals before diff value
        while(head != null && head.val == val){
            head = head.next;
        }

        //Placeholder
        ListNode temp = head;
        while(temp != null && temp.next != null ){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else if (temp.val == val){
                temp.val = temp.next.val;
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }

        }
        return head;


    }
}
