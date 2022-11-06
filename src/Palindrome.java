
public class Palindrome {

	public static void main(String[] args) {
	
		String original = "nurses run";
		original = original.replace(" ", "");
		
		String palindrome = "";
		
		for(int i = original.length() - 1 ; i >= 0; i--) {
			palindrome += original.charAt(i);
			System.out.println(palindrome);
		}
		
		boolean isPalindrome = true;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != palindrome.charAt(i)) {
				isPalindrome = false;
			}
		}
		
		if(isPalindrome) {
			System.out.println("PALINDROME!");
		}else {
			System.out.println("Not a Palindrome!");
		}
		
		System.out.println(palindrome);
		System.out.println(original);
		System.out.println(original.length());
	}

}
