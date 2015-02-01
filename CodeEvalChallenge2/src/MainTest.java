import junit.framework.Assert;

import org.junit.Test;


public class MainTest {

	@Test
	public void testIsPrime() {
		Assert.assertFalse(Main.isPrime(1));
		Assert.assertTrue(Main.isPrime(2));
		Assert.assertTrue(Main.isPrime(2));
		Assert.assertTrue(Main.isPrime(7));
		Assert.assertTrue(Main.isPrime(17));
		Assert.assertTrue(Main.isPrime(997));
	}

	@Test
	public void testIsAPalindrome() {
		Assert.assertFalse(Main.isAPalindrome(null));
		Assert.assertFalse(Main.isAPalindrome(""));
		Assert.assertTrue(Main.isAPalindrome("ABA"));
		Assert.assertTrue(Main.isAPalindrome("Malayalam"));
		Assert.assertTrue(Main.isAPalindrome("ABBA"));
		Assert.assertFalse(Main.isAPalindrome("ABCD"));
		Assert.assertFalse(Main.isAPalindrome("ABCDA"));
		Assert.assertTrue(Main.isAPalindrome("ABCDEFGGFEDCBA"));
	}

}
