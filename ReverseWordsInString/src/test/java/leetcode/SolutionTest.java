package leetcode;

import org.junit.*;
import static org.junit.Assert.*;


public class SolutionTest {

	@Test
	public void emptyString() {
		String input = "";
		String expected = "";
		Solution s = new Solution();
		String result = s.reverseWords(input);
		assertEquals(expected, result);
	}
	@Test
	public void whitespaceString() {
		String input = " 	 ";
		String expected = "";
		Solution s = new Solution();
		String result = s.reverseWords(input);
		assertEquals(expected, result);
	}
	@Test
	public void oneWord() {
		String input = "one_word";
		String expected = "one_word";
		Solution s = new Solution();
		String result = s.reverseWords(input);
		assertEquals(expected, result);
	}
	@Test
	public void chars() {
		String input = "!w(&78ord";
		String expected = "!w(&78ord";
		Solution s = new Solution();
		String result = s.reverseWords(input);
		assertEquals(expected, result);
	}
	@Test
	public void wordsMultipleWS() {
		String input = "  this   is long     sentence	 ";
		String expected = "sentence long is this";
		Solution s = new Solution();
		String result = s.reverseWords(input);
		assertEquals(expected, result);
	}
	@Test
	public void words() {
		String input = "this is not such a long sentence";
		String expected = "sentence long a such not is this";
		Solution s = new Solution();
		String result = s.reverseWords(input);
		assertEquals(expected, result);
	}
}
