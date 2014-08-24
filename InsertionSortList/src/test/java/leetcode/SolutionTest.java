package leetcode;

import org.junit.*;
import static org.junit.Assert.*;

public class SolutionTest {
	@Test
	public void testNull() {
		String expected = "[]";
		ListNode first 	= null;
		ListNode head 	= new Solution().insertionSort(first);
		String result 	= Utils.toString(head);
		assertEquals(expected, result);
	}
	@Test
	public void testOneElem() {
		String expected = "[1]";
		ListNode first 	= new ListNode(1);
		ListNode head 	= new Solution().insertionSort(first);
		String result 	= Utils.toString(head);
		assertEquals(expected, result);
	}
	@Test
	public void testTwoElems() {
		String expected = "[1,2]";
		ListNode first 	= new ListNode(1);
		ListNode second = new ListNode(2);
		first.next 	= second;
		ListNode head 	= new Solution().insertionSort(first);
		String result 	= Utils.toString(head);
		assertEquals(expected, result);
	}
	@Test
	public void testTwoElemsUnsorted() {
		String expected = "[1,2]";
		ListNode first 	= new ListNode(2);
		ListNode second = new ListNode(1);
		first.next 	= second;
		ListNode head 	= new Solution().insertionSort(first);
		String result 	= Utils.toString(head);
		assertEquals(expected, result);
	}
	@Test
	public void testThreeElems() {
		String expected = "[1,2,3]";
		ListNode first 	= new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		first.next 	= second;
		second.next	= third;
		ListNode head 	= new Solution().insertionSort(first);
		String result 	= Utils.toString(head);
		assertEquals(expected, result);
	}
	@Test
	public void testThreeElemsUnsorted() {
		String expected = "[1,2,3]";
		ListNode first 	= new ListNode(2);
		ListNode second = new ListNode(3);
		ListNode third  = new ListNode(1);
		first.next 	= second;
		second.next 	= third;
		ListNode head 	= new Solution().insertionSort(first);
		String result 	= Utils.toString(head);
		assertEquals(expected, result);
	}
}
