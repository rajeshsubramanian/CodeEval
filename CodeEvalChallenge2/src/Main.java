
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1000; i > 1; i--) {
			if (isPrime(i) && isAPalindrome(String.valueOf(i))) {
				System.out.println(i);
				return;
			}
		}
	}

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAPalindrome(String string) {

		if (string == null || string.length() == 0) {
			return false;
		}
		String lowerCaseString = string.toLowerCase();
		for (int i = 0; i < lowerCaseString.length() / 2; i++) {
			char char1 = lowerCaseString.charAt(i);
			char char2 = lowerCaseString.charAt(lowerCaseString.length() - 1 - i);
			if (char1 != char2) {
				return false;
			}
		}
		return true;
	}
}
