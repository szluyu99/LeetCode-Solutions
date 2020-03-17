package 二叉树;
/**
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * @author yusael
 */
public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
    	if(root == null) return 0;
    	return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
