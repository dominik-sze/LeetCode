package leetcode;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class SolutionTest {

	@Test
	public void testRowZero() {
		int row = 0;
		Solution s = new Solution();
		Integer[] expected = new Integer[0];
		ArrayList<Integer> res = (ArrayList<Integer>)s.getRow(0);
		Integer[] result = new Integer[res.size()];
		result = res.toArray(result);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testRowOne() {
		int row = 0;
		Solution s = new Solution();
		Integer[] expected = new Integer[]{1};
		ArrayList<Integer> res = (ArrayList<Integer>)s.getRow(1);
		Integer[] result = new Integer[res.size()];
		result = res.toArray(result);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testRowTwo() {
		int row = 0;
		Solution s = new Solution();
		Integer[] expected = new Integer[]{1,1};
		ArrayList<Integer> res = (ArrayList<Integer>)s.getRow(2);
		Integer[] result = new Integer[res.size()];
		result = res.toArray(result);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testRowThree() {
		int row = 0;
		Solution s = new Solution();
		Integer[] expected = new Integer[]{1,2,1};
		ArrayList<Integer> res = (ArrayList<Integer>)s.getRow(3);
		Integer[] result = new Integer[res.size()];
		result = res.toArray(result);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testRowSix() {
		int row = 0;
		Solution s = new Solution();
		Integer[] expected = new Integer[]{1,5,10,10,5,1};
		ArrayList<Integer> res = (ArrayList<Integer>)s.getRow(6);
		Integer[] result = new Integer[res.size()];
		result = res.toArray(result);
		assertArrayEquals(expected, result);
	}
}
