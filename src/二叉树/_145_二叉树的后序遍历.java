package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * @author yusael
 */
public class _145_二叉树的后序遍历 {
	List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return list;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
