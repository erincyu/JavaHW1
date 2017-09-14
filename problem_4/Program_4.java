package problem_4;

import java.util.Scanner;

/**
 * @author eyu
 *
 */
public class Program_4 {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
				
		//Declare variables
		double weight_1;
		double weight_2;
		double price_1;
		double price_2;
		double perLbPrice_1;
		double perLbPrice_2;
		
		//Prompt user to enter weight_1
		//read and save input
		System.out.println("Please enter the weight of package 1: ");
		weight_1 = input.nextDouble();
		
		//Check if the weight_1 is negative
		while (weight_1 < 0) {
			System.out.print("Value negative. Enter a valid weight: ");
			weight_1 = input.nextDouble();
		}
		
		//Prompt user to enter price_1
		//read and save input
		System.out.println("Please enter the price of package 1: ");
		price_1 = input.nextDouble();
				
		//Check if the price_1 is negative
		while (price_1 < 0) {
			System.out.print("Value negative. Enter a valid price: ");
			price_1 = input.nextDouble();
		}		
		
		//Prompt user to enter weight_2
		//read and save input
		System.out.println("Please enter the weight of package 2: ");
		weight_2 = input.nextDouble();		
		
		//Check if the weight_2 is negative
		while (weight_2 < 0) {
			System.out.print("Value negative. Enter a valid weight: ");
			weight_2 = input.nextDouble();
		}
		
		//Prompt user to enter price_2
		//read and save input
		System.out.println("Please enter the price of package 2: ");
		price_2 = input.nextDouble();		
		
		//Check if the price_2 is negative
		while (price_2 < 0) {
			System.out.print("Value negative. Enter a valid price: ");
			price_2 = input.nextDouble();
		}
		
		//Calculate the cost per lb of package_1 (price_1 / weight_1)
		perLbPrice_1 = price_1 / weight_1;
			
		//Calculate the cost per lb of package_2 (price_2 / weight_2)
		perLbPrice_2 = price_2 / weight_2;
		
		//Compare cost per lb
		//Print out the package which has the worst unit price
        if (perLbPrice_1 < perLbPrice_2) { // Package 2 has worse price
        	System.out.printf("Package 2 has the worst unit price at %4.2f", perLbPrice_2);
        }
        else if (perLbPrice_1 > perLbPrice_2) { // Package 2 has better price
        	System.out.printf("Package 1 has the worst unit price at %4.2f", perLbPrice_1);
        }
        else {  // per-lb cost is the same for both packages 
        	System.out.print("Package 1 and package 2 has the same unit price.");
        }
        
        input.close();
	}

}
