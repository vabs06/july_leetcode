// Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3396/

public ListNode removeElements(ListNode head, int val) {
	while (head != null && head.val == val)
		head = head.next;
	if (head == null)
		return head;
			        
	ListNode tmp = head;
	while (tmp.next != null) {
		if (tmp.next.val == val)
			tmp.next = tmp.next.next;
		else
			tmp = tmp.next;
	}
	return head;
}
