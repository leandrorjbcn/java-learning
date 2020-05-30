/**
 * This class provides a implementation of the simple operation division.
 *  
 * @author: Leandro Rjbcn
 * @version: 1.0, 30/05/2020
 * @since: 1.0 * 
 */

package p0004Division;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		Scanner scanner = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		// Input
		System.out.println("==============================================");
		System.out.println("DIVISION");
		System.out.println("The division between two integers.");
		System.out.println("==============================================");
		System.out.println("Number 1:");
		firstNumber = scanner.nextInt();
		System.out.println("Number 2:");
		secondNumber = scanner.nextInt();

		// Process
		result = division(firstNumber, secondNumber);

		// Output
		System.out.println("The division between " + firstNumber + " and " + secondNumber + " is: " + result);
	}

	/**
	 * Receive two integers and return the division between them.
	 * 
	 * @param a
	 * @param b
	 * @return an integer result of the division from a and b
	 */
	public static int division(int a, int b) {

		return (a / b);
	}
}
