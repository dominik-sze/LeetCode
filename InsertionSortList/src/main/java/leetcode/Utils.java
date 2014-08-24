package leetcode;

public class Utils {
	public static String toString(ListNode head) {
		StringBuilder sb = new StringBuilder("[");
		String prefix = "";
		while(head!=null) {
			sb.append(prefix);
			prefix = ",";
			sb.append(head.val);
			head = head.next;
		}
		sb.append("]");
		return sb.toString();
	}
}
