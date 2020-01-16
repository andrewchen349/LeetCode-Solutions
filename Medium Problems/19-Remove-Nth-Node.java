/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //Edge Case
        if( head == null){
            return head;
        }

        //Find the Size of Linked List
        int size = 0;
        ListNode pointer = head;

        while( pointer != null){
            size += 1;
            pointer = pointer.next;
        }

       int nth = (size - (n + 1));

       //Edge Case
       if(nth < 0){
           ListNode temp = head.next;
           head = null;
           return temp;
       }

       //Edge Case
       if( nth == 0){
           ListNode point = head;
           point.next = point.next.next;
           return head;
       }

        int counter = 0;

        //Reset the Point
        pointer = head;

        while( pointer != null){
            counter += 1;
            pointer = pointer.next;
            if(counter == nth){
                pointer.next = pointer.next.next;
            }
        }

        return head;

    }
}
