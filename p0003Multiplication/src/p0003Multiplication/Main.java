/**
 * This class provides an implementation of the simple multiplication operation.
 * 
 * @author Leandro Rjbcn
 * @version 1.0, 29/05/2020
 * @since: 1.0
 */

package p0003Multiplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		Scanner scanner = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		// Input
		System.out.println("MULTIPLICATION - using integers.");
		System.out.println("===============================================");
		System.out.println("Number 1: ");
		firstNumber = scanner.nextInt();
		System.out.println("Number 2: ");
		secondNumber = scanner.nextInt();

		// Process
		result = multiplication(firstNumber, secondNumber);

		// Output
		System.out.println("The multiplication between " + firstNumber + " and " + secondNumber + " is: " + result);

	}

	/**
	 * Receive two integers and return the multiplication between them.
	 * 
	 * @param a
	 * @param b
	 * @return an integer result of the multiplicaction from a and b
	 */
	public static int multiplication(int a, int b) {

		return (a * b);
	}

}
