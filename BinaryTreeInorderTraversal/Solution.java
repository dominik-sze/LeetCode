public class Solution {
    List<Integer> inorder = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) {
            return inorder;
        }
        if(root.left!=null) {
            inorderTraversal(root.left);
        }
        inorder.add(root.val);
        if(root.right!=null) {
            inorderTraversal(root.right);
        }
        return inorder;
    }
}
