/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //Temp head
        ListNode tempHead = head;

        //Create Stack, add all nodes to stack
        Stack<Integer> s = new Stack<>();

        //Add everything to stack
        while(tempHead != null){
            s.add(tempHead.val);
            tempHead = tempHead.next;
        }

        //Traverse head check each element with last element we added in stack LIFO
        while(head != null){
            if(s.pop() == head.val){
                head = head.next;
            }
            else{
                return false;
            }
        }
        return true;


    }
}
