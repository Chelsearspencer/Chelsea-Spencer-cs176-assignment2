import java.util.Arrays;
import java.lang.reflect.Array;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		//a
		int[][] intArray = new int[4][4];
		
		for (int row = 0; row < intArray.length; row++) {
			for (int col = 0; col < intArray[row].length; col++) {
				 intArray[row][col] = row * col;
			}
        }
		System.out.println("tabualar form:");
		//e (I did it beforehand)
		for (int row = 0; row < intArray.length; row++) 
		{ for (int col = 0; col < intArray[row].length; col++) {
			intArray[row][col] = row * col; 
			System.out.print(intArray[row][col] + "\t");
		}
		System.out.println();	
		}
		
		
		System.out.println();
		System.out.println("sum of elements in second row:");
	System.out.println(intArray[1][0]+ intArray[1][1]+ intArray[1][2]+ intArray[1][3]);
		
	System.out.println("sum of elements in third column:");
	System.out.println(intArray[0][2]+ intArray[1][2]+ intArray[2][2]+ intArray[3][2]);
	
	//d
	int row1 = intArray[1][0]+ intArray[1][1]+ intArray[1][2]+ intArray[1][3];
	int row2 = intArray[2][0]+ intArray[2][1]+ intArray[2][2]+ intArray[2][3];
	int row3 = intArray[3][0]+ intArray[3][1]+ intArray[3][2]+ intArray[3][3];
	int totalSum= row1 + row2 + row3;
	System.out.println("sum of table:");
	System.out.println(totalSum);
}}
