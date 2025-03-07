public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        int k = 3;

        ListNode dummy = new ListNode(-1);
        dummy.next = node1;
        while (node1 != null) {
            ListNode tailNode = dummy;
            for (int i = 0 ;i < k; i++) {
                tailNode = tailNode.next;
                if (tailNode == null) {
                    // return dummy.next;
                }
            }
            ListNode res[] = reverList(node1, node3);
        }

        reverList(node1, node3);
        System.out.println();
    }

    private static ListNode[] reverList(ListNode head, ListNode tail) {
        ListNode pre = tail.next;
        ListNode cur = head;
        while (pre != tail) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return new ListNode[]{tail, head};

    }
}