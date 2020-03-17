package 链表;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * 
 * @author yusael
 *
 */
public class _83_删除排序链表中的重复元素 {
	/*
	输入: 1->1->2
	输出: 1->2
	
	输入: 1->1->2->3->3
	输出: 1->2->3
	 */
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode cur = head;
		while(cur.next != null){
			if(cur.val == cur.next.val){
				cur.next = cur.next.next;
			}else{
				cur = cur.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(2);
		listNode.next.next.next = new ListNode(3);
		listNode.next.next.next.next = new ListNode(3);
		
		deleteDuplicates(listNode);
		
		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}

	}
}

