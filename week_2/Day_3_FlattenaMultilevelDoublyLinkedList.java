//  Question Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3386/

class Day_3_FlattenaMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        Node cur = head, tail = head;
        Stack<Node> st = new Stack<>();
        while (cur != null) {
            if (cur.child != null) {
                Node child = cur.child;
                if (cur.next != null) {
                    st.push(cur.next);
                    cur.next.prev = null;
                }
                cur.next = child;
                child.prev = cur;
                cur.child = null;
            }
            tail = cur;
            cur = cur.next;
        }
        while (!st.isEmpty()) {
            cur = st.pop();
            tail.next = cur;
            cur.prev = tail;
            while (cur != null) {
                tail = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}