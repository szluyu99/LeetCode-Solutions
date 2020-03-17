package 链表;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * 
 * @author yusael
 *
 */
public class _876_链表的中间结点 {
	/*
	 输入：[1,2,3,4,5]
	输出：此列表中的结点 3 (序列化形式：[3,4,5])
	
	输入：[1,2,3,4,5,6]
	输出：此列表中的结点 4 (序列化形式：[4,5,6])
	 */
	public static ListNode middleNode(ListNode head) {
		ListNode cur = head;
		int count = 1;
		while(cur.next != null){
			count++;
			cur = cur.next;
		}
		int middle = count/2 + 1; // 中间数	
		cur = head;
		for(int i = 1; i < middle; i++){
			cur = cur.next;
		}
		return cur;
	}
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		listNode.next.next.next.next.next = new ListNode(6);
		
		System.out.println(middleNode(listNode).val);
		
		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
	}
}
