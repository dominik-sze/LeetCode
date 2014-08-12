package leetcode;

import org.junit.*;
import static org.junit.Assert.*;

public class SolutionTest {
	@Test
	public void testEmpty() {
		int m = 0;
		int n = 4;
		int expected = 0;
		Solution s = new Solution();
		int result = s.uniquePaths(m, n);
		assertEquals(expected, result);
	}
	@Test
	public void testOneRow() {
		int m = 9;
		int n = 1;
		int expected = 1;
		Solution s = new Solution();
		int result = s.uniquePaths(m, n);
		assertEquals(expected, result);
	}
	@Test
	public void testOneColumn() {
		int m = 1;
		int n = 8;
		int expected = 1;
		Solution s = new Solution();
		int result = s.uniquePaths(m, n);
		assertEquals(expected, result);
	}
	@Test
	public void testTwoXTwo() {
		int m = 2;
		int n = 2;
		int expected = 2;
		Solution s = new Solution();
		int result = s.uniquePaths(m, n);
		assertEquals(expected, result);
	}
	@Test
	public void testTwoXThree() {
		int m = 2;
		int n = 3;
		int expected = 3;
		Solution s = new Solution();
		int result = s.uniquePaths(m, n);
		assertEquals(expected, result);
	}
	@Test
	public void testThreeXThree() {
		int m = 3;
		int n = 3;
		int expected = 6;
		Solution s = new Solution();
		int result = s.uniquePaths(m, n);
		assertEquals(expected, result);
	}
}
