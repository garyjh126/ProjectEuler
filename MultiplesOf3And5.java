import java.util.*;
public class MultiplesOf3And5 {
	public static void main (String args[]) {
		ArrayList al = new ArrayList();
		for(int i = 0; i<1000; i++) {
			if((i%3==0)||(i%5==0)) {
				al.add(i);
			}
		}
		
		int sum = 0;
		for(int i = 0; i<al.size(); i++) {
			sum+=(int)al.get(i);
		}
		System.out.print(sum);
	}
	
}
