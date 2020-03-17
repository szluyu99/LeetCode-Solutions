package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * @author yusael
 *
 */
public class _94_二叉树的中序遍历 {
	List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
    	if(root == null) return list;
    	inorderTraversal(root.left);
    	list.add(root.val);
    	inorderTraversal(root.right);
    	return list;
    }
}
