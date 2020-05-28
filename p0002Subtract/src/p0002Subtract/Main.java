/**
 * This class provides a implementation of the simple subtract operation.
 *  
 * @author: Leandro Rjbcn
 * @version: 1.0, 28/05/2020
 * @since: 1.0 * 
 */

package p0002Subtract;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		Scanner scanner = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		// Input
		System.out.println("SUBTRACT - using integers.");
		System.out.println("===============================================");
		System.out.println("Number 1: ");
		firstNumber = scanner.nextInt();
		System.out.println("Number 2: ");
		secondNumber = scanner.nextInt();

		// Process
		result = subtract(firstNumber, secondNumber);

		// Output
		System.out.println("The subtract between " + firstNumber + " and " + secondNumber + " is: " + result);
	}

	/**
	 * Receive two integers and return the subtract between them.
	 * 
	 * @param a
	 * @param b
	 * @return an integer result of the subtract from a and b
	 */
	public static int subtract(int a, int b) {

		return (a - b);
	}

}
