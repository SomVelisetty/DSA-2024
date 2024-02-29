class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-010));
	}

	public static boolean isPalindrome(int x) {
		int isPalindrome = x;
		int result = 0;
		for (int i = 0; x > 0; i++) {
			int temp = x % 10;
			result = (result * 10) + temp;
			x /= 10;
		}
		return (result == isPalindrome) ? true : false;
	}

}

// https://leetcode.com/problems/palindrome-number/submissions/1189994712/
