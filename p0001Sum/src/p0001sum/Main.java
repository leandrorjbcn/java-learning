/**
 * This class provides a implementation of the simple operation sum.
 *  
 * @author: Leandro Rjbcn
 * @version: 1.0, 27/05/2020
 * @since: 1.0 * 
 */

package p0001sum;

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
		System.out.println("SUM");
		System.out.println("The sum between two integers.");
		System.out.println("==============================================");
		System.out.println("Number 1:");
		firstNumber = scanner.nextInt();
		System.out.println("Number 2:");
		secondNumber = scanner.nextInt();

		// Process
		result = sum(firstNumber, secondNumber);

		// Output
		System.out.println("The sum between " + firstNumber + " and " + secondNumber + " is: " + result);

	}

	/**
	 * Receive two integers and return the sum between them.
	 * 
	 * @param a
	 * @param b
	 * @return an integer result of the sum from a and b
	 */
	public static int sum(int a, int b) {

		return (a + b);
	}

}
