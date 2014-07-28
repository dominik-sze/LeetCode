public class Solution {
    private List<Integer> postorderVals = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return postorderVals;
    }
    
    public void postOrder(TreeNode parent) {
        if(parent==null) {
            return;
        }
        if(parent.left!=null) {
            postOrder(parent.left);
        }
        if(parent.right!=null) {
            postOrder(parent.right);
        }
        postorderVals.add(parent.val);
    }
}
