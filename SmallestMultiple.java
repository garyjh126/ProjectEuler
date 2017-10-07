import java.util.*;
public class SmallestMultiple {
	public static void main (String args[]) {
		int i = 1; 
		int index = 0; 
		int array [] = new int[20];
		int smallest = Integer.MAX_VALUE;
		while(index<20) {
			array[index] = index+1;
			if((i%array[index]==0)&&(i<smallest)) {
				smallest = i;
			}
			i++;
		}
		System.out.print(smallest);
	}
}
