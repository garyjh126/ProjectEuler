import java.util.ArrayList;

public class EvenFibonacciNumbers {
	public static void main (String args[]){
		ArrayList fibonacci = new ArrayList();
		fibonacci.add(1);
		fibonacci.add(2);
		int counter = 0;
		int sum = 2;
		for(int i = 3; i<4000000; i++) {
			
			int first = (int)fibonacci.get(counter); 
			int second = (int)fibonacci.get(counter+1);
			
			if((i==first+second)) { //May add to arraylist --- first & second change
				fibonacci.add(i);
				counter++;
				
				if(i%2==0) {
					sum+=i;
				}
			}
			
		}
		
		System.out.print(sum);
		
		//Disregard first element (1) when summing
	}

}
