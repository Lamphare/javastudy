/*	This program is to let the user choose different ways of
 * calculating the sum of all terms when the sum is at least 20000
 *  in the series 10*(k^2) - 4*k +2, k =1,2,3..,n as well as the max of k
 *  Using simple for loop, array+for loop to include printing term function
 *  and using reimann integral to calculate precisely assuming k is double.
 *  Program created by Reagan Stovall and Yiran Guo
 */
public class CodeChallenge5 {

	public static void main(String[] args){
		boolean again;
		int option;	//choosing which way to calculate the sum
		int k;
		int total;
		
		do { 
		System.out.println("How do you want to calculate the sum of term and how many terms?");
		System.out.println();
		System.out.println("   1. Boring old way.");
		System.out.println("   2. Array-a-way.");
		System.out.println("   3. The perciser way.");  //placeholder not yet implemented
		System.out.println();
		System.out.println("Enter the number of your choice:");
		option = TextIO.getInt(); //asking for option.
		
		/* 1.using for loop 2.using array 3.using loop and reimann integral */
		
		switch ( option ){
		
		case 1:
			k = 0;
			total = 0;   //initialization
			for ( total = 0; total <= 20000; k++  ){
				total = 10*(k^2) - 4*k +2 + total;
			}
			System.out.print("The sum of all term is :" + total);
			System.out.print(" with " + k + " terms ");
			break; //end of option 1
			
		case 2:		//this choice supposed to store each term in an array and print them on demand
			k = 0;
			total = 0;
			int[] array;
			array = new int[20000]; //20000 is arbitrary, current method probably needs change.
			for ( total = 0; total < array.length; k++ ){
			total = 10*(k^2) - 4*k +2 + total;
			}
			System.out.print("The sum of all term is :" + total);
			System.out.print(" with " + k + " terms ");
			boolean print;
			System.out.println("do you want to see all the terms?");
			print = TextIO.getBoolean();
			do {
			System.out.println(array[total]); //not sure how to fix this
			}
			while (print !=false);
			break; //end of option 2
		
		default:
			System.exit(1);
		}
		System.out.println("");
		System.out.println("Try another way?");  //looping back to start menu
		again = TextIO.getlnBoolean();
		}
		while (again !=false);  //end of loop
		System.out.println("Thanks for using?");
		}
	}

