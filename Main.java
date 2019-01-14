
class Main {

	public static void main(String[] args) {
		System.out.println(reverseString("Hello Mr Java"));
	}

	/**
	 * Reverse a String
	 *
	 * @param str The String to reverse
	 * @return The reversed String
	 */
	private static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
