
public class WhileLoop {

	public static void main(String[] args) {
		int n = 121;
		char[] nString = Integer.toString(n).toCharArray();
		int i = 0;
		int length = nString.length;
		int midpoint = length/2;
		if (length % 2 != 0) {
			midpoint += 1;
		}
		boolean isPalindrome = true;
		while (i < midpoint) {
			if (nString[i] != nString[length-1-i]) {
				isPalindrome = false;
				break;
			}
			i++;
		}
		if (isPalindrome) {
			System.out.println("value is a palindrome");
		} else {
			System.out.println("value is not a palindrome");
		}

	}

}
