public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) {
            return false;
        }
        ListNode turtle = head;
        ListNode rabbit = head.next;
        while(rabbit!=turtle) {
            if(turtle.next==null || rabbit.next==null || rabbit.next.next==null) {
                return false;
            }
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        return true;
    }
}
