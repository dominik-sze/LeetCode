public class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null) {
            return 0;
        }
        return traverse(root, 0);
    }
    
    private int traverse(TreeNode node, int x) {
        if(node.left==null && node.right==null) {
            return 10*x+node.val;
        }
        int val = 0;
        if(node.left!=null) {
            val += traverse(node.left, 10*x + node.val);
        }
        if(node.right!=null) {
            val += traverse(node.right, 10*x + node.val);
        }
        return val;
    }
}
