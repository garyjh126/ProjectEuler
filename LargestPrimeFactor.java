
public class LargestPrimeFactor {
	public static void main (String args[]) {
		long num = 600851475143l;
		long largest = 0l; 
		
		for(int i = 2; i<num/2; i++) {
			if(isPrime(i)&&(i>largest)) {
				largest = i;
			}
		}	
		
		System.out.print(largest);
	}
	public static boolean isPrime(long n) {
		boolean bool = true;
		for(long i = 2; i<n; i++) {
			if(n%i==0) {
				bool = false;
			}
		}
		return bool;
	}
}
