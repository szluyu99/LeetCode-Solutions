package 链表;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 
 * @author yusael
 *
 */
public class _203_移除链表元素 {
	/*
	 * 输入: 1->2->6->3->4->5->6, val = 6 输出: 1->2->3->4->5
	 */
	public static ListNode removeElements(ListNode head, int val) {
		if (head == null || (head.next == null && head.val == val)) {
			return null;
		}
		while (head.val == val) {
			head = head.next;
			if (head == null)
				return null;
		}
		ListNode cur = head;
		ListNode prv = head;
		while (cur != null) {
			if (cur.val == val) {
				prv.next = cur.next;
				cur = prv;
			} else {
				prv = cur;
				cur = cur.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(1);
		listNode.next.next.next = new ListNode(1);
		// listNode.next.next.next.next = new ListNode(1);
		listNode = removeElements(listNode, 1);

		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}

	}
}
