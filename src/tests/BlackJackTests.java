package tests;
import defaultPackage.Blackjack;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class BlackJackTests {

	@Test
	void testBlackJackFirst() {
		assertEquals("This was not the expected output", 21, Blackjack.blackjack(21, 15));
	}
	
	@Test
	void testBlackJackSecond() {
		assertEquals("This was not the expected output", 20, Blackjack.blackjack(19, 20));
	}
	
	@Test
	void testBlackJackEqual() {
		assertEquals("This was not the expected output", 19, Blackjack.blackjack(19, 19));
	}
	
	@Test //Don't need to test for negative numbers as the spec says that only numbers greater than 0 will be input
	void testBlackJackOver() {
		assertEquals("This was not the expected output", 0, Blackjack.blackjack(22, 30));
	}
	
	@Test
	void testUniqueSumFirst() {
		assertEquals("This was not the expected output", 6, Blackjack.uniqueSum(1, 2, 3));
	}
	
	@Test
	void testUniqueSumSecond() {
		assertEquals("This was not the expected output", 6, Blackjack.uniqueSum(3, 1, 2));
	}
	
	@Test
	void testUniqueSumThird() {
		assertEquals("This was not the expected output", 6, Blackjack.uniqueSum(2, 3, 1));
	}
	
	@Test
	void testUniqueSumNone() {
		assertEquals("This was not the expected output", 0, Blackjack.uniqueSum(3, 3, 3));
	}
	
	@Test //You can have multiple assertEquals in one test, but they all have to pass, if one fails the whole test fails 
	void testUniqueSumOne() {
		int[] numbers = {1, 3, 3};
		for(int i = 0; i < numbers.length; i++) {
			assertEquals("This was not the expected output", 1, Blackjack.uniqueSum(numbers[i%3], numbers[(i+1)%3], numbers[(i+2)%3]));
		}	
	}
	
	@Test
	void testTooHotNormal1() {
		assertEquals("This was not the expected output", true, Blackjack.tooHot(70, false));
	}
	
	@Test
	void testTooHotNormal2() {
		assertEquals("This was not the expected output", true, Blackjack.tooHot(70, true));
	}
	
	@Test
	void testTooHotBelow() {
		assertEquals("This was not the expected output", false, Blackjack.tooHot(55, false));
	}
	
	@Test
	void testTooHotAbove() {
		assertEquals("This was not the expected output", false, Blackjack.tooHot(95, false));
	}
	
	@Test
	void testTooHotSummer() {
		assertEquals("This was not the expected output", true, Blackjack.tooHot(95, true));
	}
	
	@Test
	void testTooHotSummerAbove() {
		assertEquals("This was not the expected output", false, Blackjack.tooHot(105, true));
	}
	
	
	
	
	

}