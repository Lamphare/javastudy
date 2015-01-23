/**
*Using scanner for triangle sides input and math. to calculate for
*perimeter, area and possibly angles
*debug needed without making loops.(challenging).
*/

import java.util.Scanner;	// Scanner is an java utility that scans for user keyboard input.

public class CodeChallengeTriangle {

	public static void main(String[] args){
	double a;
	double b;
	double c;	//Three sides
	
	Scanner stdin = new Scanner( System.in ); //Open the resource for later input.
	
	System.out.println("Give me the first side for your triangle.");
	a = stdin.nextDouble();		//It only accept double as input. stdin.next[type] is the syntax. for text, use [Line]
	System.out.println("Give me the second side for your triangle.");		//currently anything else 
	b = stdin.nextDouble();		//e.g. characters would screw the program up.
	System.out.println("Give me the last side for your triangle.");
	c = stdin.nextDouble();
	}
	
	public static double TrianglularPSA( double a, double b, double c ){ //Modularization. including perimeter area semiperimeter
	double p = (a + b + c);		//perimeter
	double s = (a + b + c)/2;	//semi-perimeter
	double A = Math.sqrt ( s * ( s - a ) * ( s - b ) * ( s - c));	//Area
	
	}
	
	public static void printout(String[] args){
	System.out.println("The Perimeter of your triangle is " + p + ", and the area is" + a);
	}
	/**	this should look fine up to this point.
	*inserting module after main and before printout.
	*Then add corresponding print for new module.
	*/
}

