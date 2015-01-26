/**
*Using scanner for cartesian coordinates
*and convert it into corresponding polar coordinates
* Coded By Reagan Stovall and Yiran Guo
*/
public class CodeChallengeCartesianToPolar {

	public static void main(String[] args) {
		//get and define X and Y//
		boolean again;	//Loop value
		double X;		//X value
		double Y;		//Y value
		double r;		//distance from the origin to the given point
		double angle1;	//Theta for positive Y
		double angle2;	//Theta for negative Y
		double angle3;	//Theta for when both are negative
		
	System.out.println("This is a program using polar coordinates to find the");
	System.out.println("distance from the origin as well as the angle with");	
	System.out.println("respect to the positive x-axis");
	
	do {
		System.out.println("what is your X value?");
			X = TextIO.getlnDouble();
		System.out.println("what is your Y value?");
			Y = TextIO.getlnDouble();
		
		//defining the variables
			
		r = Math.sqrt ( X * X + Y * Y );	//distance from the origin to the point of interest
		angle1 = Math.atan( Y / X ) * (180 / Math.PI);	//angle from the positive x axis.
		angle2 = Math.atan( Y / X ) * (180 / Math.PI) + 180;	//angle if y is negative.
		angle3 = Math.atan( Y / X ) * (180 / Math.PI) + 360;	//angle if y is negative.
		
		if ( X > 0 && Y >= 0 ){
			System.out.println();
			System.out.printf("The angle is %1.2f°" ,angle1 );
			System.out.println();
			System.out.printf("The distance from the origin is %1.2f" ,r );
		}	
		else if ( X < 0 && Y >= 0 ){
			System.out.println();
			System.out.printf("The angle is %1.2f°" ,angle2 );
			System.out.println();
			System.out.printf("The distance from the origin is %1.2f" ,r );		
		}	
		else if ( X < 0 && Y < 0 ){
			System.out.println();
			System.out.printf("The angle is %1.2f°" ,angle2 );
			System.out.println();
			System.out.printf("The distance from the origin is %1.2f" ,r );		
		}	
		else if ( X > 0 && Y < 0 ){
			System.out.println();
			System.out.printf("The angle is %1.2f°" ,angle3 );
			System.out.println();
			System.out.printf("The distance from the origin is %1.2f" ,r );
		}
		else if ( X == 0 && Y > 0 ){
			System.out.println("The angle is 90°");
			System.out.println();
			System.out.printf("The distance from the origin is %1.2f" ,r );		
		}
		else if ( X == 0 && Y < 0 ){
			System.out.println("The angle is 270°");
			System.out.println();
			System.out.printf("The distance from the origin is %1.2f" ,r );
		}
		else if ( X == 0 && Y == 0 ){
			System.out.println("The angle is undefined");
			System.out.println();
			System.out.printf("The distance from the origin is %1.2f" ,r );
		}
		
		System.out.println();
		System.out.println("Did you want me to try a differnet set?(Y/N)");	//repeat loop?
		again = TextIO.getlnBoolean();
	}
	while ( again != false );	
	
	System.out.println("Glad I could help!");
		
	}	//end of main

}	//end of class
