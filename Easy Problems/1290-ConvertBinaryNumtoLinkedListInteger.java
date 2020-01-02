/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {

        //Check if Head is Null
        if( head.next == null){
            return head.val;
        }
        String s = "";
        while(head != null){
            s = s + head.val;
            head = head.next;
        }

        System.out.println(s);
        int result = Integer.parseInt(s, 2); //Base 2 to Base 10

        return result;


    }
}
