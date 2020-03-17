package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * @author yusael
 */

public class _226_翻转二叉树 {
// 层次遍历
	public TreeNode invertTree(TreeNode root) {
		if(root == null) return root;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			
			TreeNode treeNode = node.left;
			node.left = node.right;
			node.right = treeNode;
			
			if(node.left != null){
				queue.offer(node.left);
			}
			if(node.right != null){
				queue.offer(node.right);
			}
		}
		return root;
	}
// 中序遍历
//    public TreeNode invertTree(TreeNode root) {
//    	if(root == null) return root;
//        
//    	invertTree(root.left);
//
//    	TreeNode treeNode = root.left;
//        root.left = root.right;
//        root.right = treeNode;
//
//        invertTree(root.left);
//        return root;
//    }
// 先序遍历
//    public TreeNode invertTree(TreeNode root) {
//    	if(root == null) return root;
//        
//        TreeNode treeNode = root.left;
//        root.left = root.right;
//        root.right = treeNode;
//
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }
// 后序遍历
//    public TreeNode invertTree(TreeNode root) {
//    	if(root == null) return root;
//        invertTree(root.left);
//        invertTree(root.right);
//        
//        TreeNode treeNode = root.left;
//        root.left = root.right;
//        root.right = treeNode;
//
//        return root;
//    }
}
