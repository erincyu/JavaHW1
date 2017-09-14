package problem_3;

import java.util.Scanner;

/**
 * @author eyu
 *
 */
public class Program_3 {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		double balance;
		double interestRate;
		double interestAmount;
		
		//Prompt user to enter balance
		//read and save input
		System.out.println("Please enter your monthly mortgage payment: ");
		balance = input.nextDouble();
		
		//Check if the balance is negative
		while (balance < 0) {
			System.out.print("Value negative. Enter a valid balance: ");
			balance = input.nextDouble();
		}
		
		//Prompt user to enter interestRate
		//read and save input
		System.out.println("Please enter the annual interest rate: ");
		interestRate = input.nextDouble();
		
		//Check if the interestRate is negative
		while (interestRate < 0) {
			System.out.print("Value negative. Enter a valid interest rate: ");
			interestRate = input.nextDouble();
		}
		
		//Calculate interestAmount
		interestAmount = balance * (interestRate / 1200); 
		
		//Print out the interestAmount
		System.out.printf("Interest: %4.2f" , interestAmount); 
		
		input.close();
	}

}

