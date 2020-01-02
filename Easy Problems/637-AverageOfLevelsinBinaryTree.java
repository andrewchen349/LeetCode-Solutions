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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> results = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        //Edge Case
        if( root == null){
            return results;
        }

        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();
            double sum = 0;

            for(int i = 0; i < size; i++){
                TreeNode current = q.remove();
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }

                sum = sum + current.val;
            }

            results.add((double) (sum / size));
        }

        return results;

    }
}
