public class Solution {
    
    public int maxDepth(TreeNode root) {
        int max = 0;
        if(root!=null) {
            max = goDeeper(root, 1);
        }
        return max;
    }
    
    public int goDeeper(TreeNode node, int depth) {
        int l=depth;
        int r=depth;
        if(node==null) {
            return depth;
        }
        if(node.left!=null) {
            l = goDeeper(node.left, depth+1);
        }
        if(node.right!=null) {
            r = goDeeper(node.right, depth+1);
        }
        return (int)Math.max(l, r);
    }
}
