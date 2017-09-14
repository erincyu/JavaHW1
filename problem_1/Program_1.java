package problem_1;

import java.util.Scanner;

/**
 * @author eyu
 *
 */
public class Program_1 {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Declare Variables
		String studentName;
		String major;
		int age;
		double height;
		
		//Prompt user to enter inputs
		//save and read inputs
		System.out.println("Please enter student's name: ");
		studentName = input.nextLine();
		
		System.out.println("Please enter student's major: ");
		major = input.nextLine();
		
		System.out.println("Please enter student's age: ");
		age = input.nextInt();
		
		System.out.println("Please enter student's height: ");
		height = input.nextDouble();
		
		//Print outputs
		System.out.print(studentName + " " + major +" " + age + " " + height );
		
		input.close();
	}

}
