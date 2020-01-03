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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<TreeNode> level = new ArrayList<>();
            List<Integer> nodeVal = new ArrayList<>();

            while(!q.isEmpty()){
                TreeNode cur = q.poll(); //Remove Node From Queue, FIFO
                nodeVal.add(cur.val); //Add Node Value To List

                if( cur.left != null){
                    level.add(cur.left);
                }

                if(cur.right != null){
                    level.add(cur.right);
                }

            }

            result.add(0, nodeVal);
            for(int i = 0; i < level.size(); i++ ){
                q.add(level.get(i));
            }

        }

        return result;

    }
}
