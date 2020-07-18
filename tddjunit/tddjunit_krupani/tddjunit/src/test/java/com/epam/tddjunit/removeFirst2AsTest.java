package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeFirst2AsTest {
	/* TODO list for my feature
	 * 1. 'A' is present as first character : ABCD => BCD - success
	 * 2. First 2 characters are A's : AACD => CD - success
	 * 3. 'A' is present as second character : BACD => BCD - success
	 * 4. 'A' present after two characters in string : CDAA => CDAA - success
	 * 5. 'A' present at first two characters followed by other zero/one/more characters followed by one/ more A's : AABAA => BAA - success
	 * 6. Only character is present not A : B => B - success
	 * 7. String contains only 2 A's : AA => "" - success
	 * 8. Empty char : "" => "" - success
	 */
	RemoveFirst2As removeFirst2As;
	@BeforeEach
	void setUp() {
		removeFirst2As = new RemoveFirst2As();
	}
	@Test
	void testRemoveAasFirstChar() {
		assertEquals("BCD", removeFirst2As.remove("ABCD"));
	}
	@Test
	void testRemoveFirstAs() {
		assertEquals("CD", removeFirst2As.remove("AACD"));
	}
	@Test
	void testremoveAPresentOnlyAt2Pos() {
		assertEquals("BCD", removeFirst2As.remove("BACD"));
	}
	@Test
	void testAAfterTwoChars() {
		assertEquals("CDAA", removeFirst2As.remove("CDAA"));
	}
	@Test
	void testAAtDifferentPos() {
		assertEquals("BAA", removeFirst2As.remove("AABAA"));
	}
	@Test
	void testOneChar() {
		assertEquals("B", removeFirst2As.remove("B"));
	}
	@Test
	void testStringWith2As() {
		assertEquals("", removeFirst2As.remove("AA"));
	}
	@Test
	void testEmptyChar() {
		assertEquals("", removeFirst2As.remove(""));
	}
}
