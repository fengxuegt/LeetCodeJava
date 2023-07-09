//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 430 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        reversePrint__(head, list);
        int [] res = new int[list.size()];
        int k = 0;
        for (int i : list) {
            res[k++] = i;
        }
        return res;
    }
    public static void reversePrint__(ListNode head, List<Integer> list) {
        if (head == null) {
            return;
        }
        reversePrint__(head.next, list);
        list.add(head.val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
