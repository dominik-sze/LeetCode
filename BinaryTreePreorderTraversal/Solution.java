public class Solution {
    List<Integer> preorder = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) {
            return preorder;
        } else {
            preorder.add(root.val);
        }
        if(root.left!=null) {
            preorderTraversal(root.left);
        }
        if(root.right!=null) {
            preorderTraversal(root.right);
        }
        return preorder;
    }
}
