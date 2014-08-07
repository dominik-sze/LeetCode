public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode max  = null;
        ListNode tmp1 = null;
        ListNode tmp2 = null;
        if(l1==null) {
            return l2;
        }
        if(l2==null) {
            return l1;
        }
        if(l1.val<=l2.val) {
            head  = l1;
            tmp1  = l2;
        } else {
            head  = l2;
            tmp1  = l1;
        }
        max = head;
        while(max.next!=null) {
            if(max.next.val<=tmp1.val) {
                max = max.next;
            } else {
                tmp2     = max.next;
                max.next = tmp1;
                tmp1     = tmp2;
            }
        }
        max.next = tmp1;
        return head;
    }
}
