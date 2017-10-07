import java.util.*;
public class LargestPalindromeProduct {
	
	
	public static void main (String args[]) {
		int product=0;
		int lengthLargest =0;
		String largestPalindrome = "";
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Largest largest = new Largest();
		for(int i = 1; i<1000; i++) {
			product = 0;
			
			for(int j = i; j<1000; j++) {
				product = i*j;
				String check = ""+product;
				if(isPalindrome(check)) {
					if(largest.multiplicand*largest.multiplier<product) {
						lengthLargest=check.length();
						largestPalindrome = check;
						largest = new Largest(lengthLargest, largestPalindrome);
						largest.multiplier = j;
						largest.multiplicand = i;
					}
				}
			}
		}
		
		System.out.println(largest.l);
		System.out.print(largest.multiplier+" x "+largest.multiplicand);

	}
	
	public static boolean isPalindrome(String str)
	{
		
	    //test for end of recursion
	    if(str.length() < 2) {return true;}

	    //check first and last character for equality
	    if(str.charAt(0) != str.charAt(str.length() - 1)){return false;}
	    
	    //recursion call 
	    return isPalindrome(str.substring(1, str.length() - 1));
	}
}
class Largest {
	
	
	int size;
	String l;
	int multiplier; 
	int multiplicand;
	Largest(){
		
	}
	
	Largest(int size, String l) {
		this.size = size;
		this.l = l;
	}
}

