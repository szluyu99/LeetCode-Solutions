package 链表;
/**
 * https://leetcode-cn.com/problems/linked-list-cycle/submissions/
 * @author yusael
 *
 */
public class _141_环形链表 {
	public boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) return false;
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) return true;
		}
		return false; 
	}
}
