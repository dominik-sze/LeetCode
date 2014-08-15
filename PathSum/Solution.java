public class Solution {
    private List<Integer> leafSums = new ArrayList<>();
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) {
            return false;
        }
        traverse(root, root.val);
        for(int tmp: leafSums) {
            if(tmp==sum) {
                return true;
            }
        }
        return false;
    }
    
    private void traverse(TreeNode node, int current) {
        if(node.left==null && node.right==null) {
            leafSums.add(current);
            return;
        }
        if(node.left!=null) {
            traverse(node.left, current+node.left.val);
        }
        if(node.right!=null) {
            traverse(node.right, current+node.right.val);
        }
    }
}
