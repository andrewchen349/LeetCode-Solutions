/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum = 0;


    public void traverse(TreeNode root, Boolean bool){
        if (root == null){
            return;
        }

        if(bool == true && root.left == null && root.right == null){
            sum = sum + root.val;
        }

        traverse(root.left, true);
        traverse(root.right, false);

    }

    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){
            return 0;
        }

        traverse(root, false);

        return sum;


    }
}
