package leetcode;

import org.junit.*;
import static org.junit.Assert.*;

public class UtilsTest {
	@Test
	public void testEmpty() {
		String expected = "[]";
		ListNode first  = null;
		String result   = Utils.toString(first);
		assertEquals(expected, result);
	}
	@Test
	public void testOneElem() {
		String expected = "[1]";
		ListNode first  = new ListNode(1);
		String result   = Utils.toString(first);
		assertEquals(expected, result);
	}
	@Test
	public void testTwoElems() {
		String expected = "[1,2]";
		ListNode first  = new ListNode(1);
		ListNode second = new ListNode(2);
		first.next = second;
		String result = Utils.toString(first);
		assertEquals(expected, result);
	}
	@Test
	public void testThreeElems() {
		String expected = "[1,2,3]";
		ListNode first  = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		first.next = second;
		second.next = third;
		String result = Utils.toString(first);
		assertEquals(expected, result);
	}
}
