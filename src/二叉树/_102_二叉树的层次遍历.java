package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @author yusael
 *
 */
public class _102_二叉树的层次遍历 {
	List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
    	if(root == null) return resList;
    	
    	Queue<TreeNode> queue = new LinkedList<>(); // 利用队列
    	int levelSize = 1;
    	queue.offer(root);
    	
    	List<Integer> list = new ArrayList<>(); ;
    	while(!queue.isEmpty()){
    		TreeNode node = queue.poll();
    		list.add(node.val);
    		levelSize--;
    		
    		if(node.left != null) queue.offer(node.left);
    		if(node.right != null) queue.offer(node.right);

    		if(levelSize == 0){
    			resList.add(list);
    			levelSize = queue.size();
    			list = new ArrayList<>(); // 初始化内层List
    		}
    	}
    	return resList;
    }
}
