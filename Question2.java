import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> array = new ArrayList<>();
	int i = 0;
	int x = 0;
	System.out.println("type in integers till done (type done)");
	while(in.hasNextDouble()) {
		x = in.nextInt();
		array.add(x);
		
		i++;
	}
	System.out.println("initial array:");
	System.out.println(array);
	System.out.println();
	
	System.out.println("elements at even index:");
	 for(int g = 0; g< array.size()-1; g=g+2) {
		 System.out.print(array.get(g)+" ");
	 }
	 System.out.println();
	 System.out.println();
	 System.out.println("even elements: ");
	 for (double something : array){
			if (something % 2==0) {
			System.out.println(something +" ");
			}
		}
	 System.out.println();
	 System.out.println("odd elements: ");
		for (double something : array) {
			if (something%2!=0) {
				System.out.println(something+" ");
			}
			
		}

		Collections.reverse(array);
		System.out.println();
		System.out.println("reversed array: ");
		System.out.println(array);
		
		////first middle last!!!!!
		Collections.reverse(array);
		System.out.println();
		System.out.println("first element: "+array.get(0));
		System.out.println("middle element: "+(array.get(array.size()/2)));
		System.out.println("last element: "+array.get(array.size()-1));
		
		
		System.out.println();
		System.out.println("largest element:");
		System.out.println(Collections.max(array));
		System.out.println("smallest element:");
		System.out.println(Collections.min(array));
		
			
		System.out.println("sum of elements:");
		double sum = 0;
		for(int s = 0; s < array.size(); s++) {
			
		    sum += array.get(s);
		}
		System.out.println(sum);
	
	
	
	
	
	
	}

}
