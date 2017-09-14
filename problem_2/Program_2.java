package problem_2;

import java.util.Scanner;

/**
 * @author eyu
 *
 */
public class Program_2 {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		String unit;
		double side;
		double area;
		
		//Prompt user to enter side measurement
		//read and save input
		System.out.println("Please enter the side measurement: ");
		side = input.nextDouble();
		
		//Check if the values are negative
		do {
			System.out.print("Value negative. Enter another value: ");
			side = input.nextDouble();
		} while (side < 0 );
		
		//Prompt user to enter unit
		//read and save input
		System.out.println("Please enter the unit of measurement: ");
		unit = input.next();
		
		//Check if the unit is valid
		//Prompt user to enter correct value if initial value is not valid
		do {
			System.out.print("Unit is not valid. Please enter another unit: ");
			unit = input.next();
		} while (!unit.equals("in")&&!unit.equals("cm")&&!unit.equals("ft")&&!unit.equals("m"));
		
		//Calculate the area of the square
		area = side * side;
		
		//Print out the area of the square
		System.out.print("The area is: " + area + " " + unit);		
		
		input.close();
	}
	
}
