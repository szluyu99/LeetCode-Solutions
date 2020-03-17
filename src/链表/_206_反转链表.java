package 链表;
/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * @author yusael
 *
 */

public class _206_反转链表 {
	// 递归
    public ListNode reverseList1(ListNode head) {
    	// 输入：head->5->4->3->2->1
    	// reverseList(head)：newHead->1->2->3->4->5
    	// reverseList(head->next): newHead->1->2->3->4<-5<-head
    	if(head == null) return null; // 空链表
    	if(head.next == null) return head; // 只有一个节点
    	ListNode newHead = reverseList1(head.next);
    	head.next.next = head;
    	head.next = null; // newHead->1->2->3->4->5->null
    	return newHead;
    }
    // 迭代
    public ListNode reverseList2(ListNode head) {
    	ListNode newHead = null;
    	while(head != null){
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
    	}
    	return newHead;
    }
}
