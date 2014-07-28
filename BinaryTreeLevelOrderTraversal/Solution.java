public class Solution {
    List<ArrayList<Integer>> levels = new ArrayList<ArrayList<Integer>>();
    public List<ArrayList<Integer>> levelOrder(TreeNode root) {
        if(root!=null) {
    		levels.add(new ArrayList<Integer>());	
    		levels.get(0).add(root.val);
    		levelOrderTraversal(root, 1);
    	}
	return levels;
    }

    public void levelOrderTraversal(TreeNode node, int level) {
    	if((node.left!=null || node.right!=null) && levels.size()<=level) {
    	    levels.add(new ArrayList<Integer>());
    	}
    	if(node.left!=null) {
    		levels.get(level).add(node.left.val);
    		levelOrderTraversal(node.left, level+1);
    	}
    	if(node.right!=null) {
    		levels.get(level).add(node.right.val);
    		levelOrderTraversal(node.right, level+1);
    	}
    }
}
