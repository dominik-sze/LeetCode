package leetcode;

import org.junit.*;
import static org.junit.Assert.*;

public class SolutionTest {

	@Test
	public void testEmpty() {
		int[][] test = {};
		int expected = 0;
		Solution s = new Solution();
		int result = s.minPathSum(test);
		assertEquals(expected, result);
	}
	@Test
	public void testOneElem() {
		int[][] test = {{1}};
		int expected = 1;
		Solution s = new Solution();
		int result = s.minPathSum(test);
		assertEquals(expected, result);
	}
	@Test
	public void testOneRow() {
		int[][] test = {{1,2,3,4}};
		int expected = 10;
		Solution s = new Solution();
		int result = s.minPathSum(test);
		assertEquals(expected, result);
	}
	@Test
	public void testOneColumn() {
		int[][] test = {{1},{2},{3},{4}};
		int expected = 10;
		Solution s = new Solution();
		int result = s.minPathSum(test);
		assertEquals(expected, result);
	}
	@Test
	public void testMatrix1() {
		int[][] test = {{1,2,3,4,5},
				{1,1,2,3,4},
				{3,1,1,4,5},
				{5,3,1,1,1}};
		int expected = 8;
		Solution s = new Solution();
		int result = s.minPathSum(test);
		assertEquals(expected, result);
	}
	@Test
	public void testMatrix2() {
		int[][] test = {{1,2,3,4,5},
				{1,2,2,3,4},
				{1,3,4,4,5},
				{1,1,1,1,1}};
		int expected = 8;
		Solution s = new Solution();
		int result = s.minPathSum(test);
		assertEquals(expected, result);
	}
	@Test
	public void testMatrix3() {
		int[][] test = {{1,1,1,1,1},
				{1,4,2,3,1},
				{3,1,4,4,1},
				{5,3,1,1,3}};
		int expected = 10;
		Solution s = new Solution();
		int result = s.minPathSum(test);
		assertEquals(expected, result);
	}
}
