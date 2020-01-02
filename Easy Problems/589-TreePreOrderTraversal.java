/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer>sol = new ArrayList<Integer>();

        Stack<Node>tree = new Stack<Node>();

        if(root == null){
            return Collections.emptyList();
        }

        tree.push(root); //push root node into stack
        while(!tree.isEmpty()){
            Node current = tree.pop();
            sol.add(current.val);
            Stack<Node>anotherOne = new Stack<Node>();

            for(Node children : current.children){
                anotherOne.push(children);
            }
            while(!anotherOne.isEmpty()){
                tree.push(anotherOne.pop());
            }

        }

        return sol;

    }
}
