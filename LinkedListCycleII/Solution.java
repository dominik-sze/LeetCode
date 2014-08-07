public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode turtle = head;
        ListNode hare   = head;
        do {
            if(turtle==null || hare==null) {
                return null;
            }
            turtle = turtle.next;
            hare   = hare.next;
            if(hare!=null) {
                hare = hare.next;
            } else {
                return null;
            }
        } while(turtle!=hare);
        turtle = head;
        while(turtle!=hare) {
            turtle = turtle.next;
            hare   = hare.next;
        }
        return turtle;
    }
}
