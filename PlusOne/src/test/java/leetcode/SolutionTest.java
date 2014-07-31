package leetcode;

import org.junit.*;
import static org.junit.Assert.*;

public class SolutionTest {

	@Test
	public void testEmptyArray() {
		int[] digits = new int[0];
		Solution s = new Solution();
		int[] expected = new int[]{1};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testOneElem() {
		int[] digits = new int[]{3};
		Solution s = new Solution();
		int[] expected = new int[]{4};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testOneElemNine() {
		int[] digits = new int[]{9};
		Solution s = new Solution();
		int[] expected = new int[]{1,0};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testTwoElem() {
		int[] digits = new int[]{9,2};
		Solution s = new Solution();
		int[] expected = new int[]{9,3};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testTwoElemNine() {
		int[] digits = new int[]{2,9};
		Solution s = new Solution();
		int[] expected = new int[]{3,0};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testTwoElemNines() {
		int[] digits = new int[]{9,9};
		Solution s = new Solution();
		int[] expected = new int[]{1,0,0};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testThreeElem() {
		int[] digits = new int[]{2,9,9};
		Solution s = new Solution();
		int[] expected = new int[]{3,0,0};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testThreeElemNines() {
		int[] digits = new int[]{9,9,9};
		Solution s = new Solution();
		int[] expected = new int[]{1,0,0,0};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}

	@Test
	public void testEightElem() {
		int[] digits = new int[]{1,9,3,4,2,9,9,9};
		Solution s = new Solution();
		int[] expected = new int[]{1,9,3,4,3,0,0,0};
		int[] result = s.plusOne(digits);
		assertArrayEquals(expected, result);
	}
}
