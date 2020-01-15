/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return head;
        }

        Stack<ListNode> stack = new Stack<>();

        while( head != null){
            stack.add(head);
            head = head.next;
        }

        head = stack.pop();
        ListNode pointer = head;

        while(!stack.isEmpty()){
            pointer.next = stack.pop();
            pointer = pointer.next;
        }

        pointer.next = null; //Set End of Linked List

        return head;

    }
}
