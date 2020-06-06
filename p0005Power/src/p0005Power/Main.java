/**
 * This class provides a implementation of the simple power operation.
 *  
 * @author: Leandro Rjbcn
 * @version: 1.0, 06/06/2020
 * @since: 1.0 * 
 */

package p0005Power;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		Scanner scanner = new Scanner(System.in);
		int base = 0;
		int exponent = 0;
		int power = 0;

		// Input
		System.out.println("==============================================");
		System.out.println("POWER");
		System.out.println("==============================================");
		System.out.println("Base:");
		base = scanner.nextInt();
		System.out.println("Exponent:");
		exponent = scanner.nextInt();

		// Process
		Power pwr = null;
		power = pwr.power(base, exponent);

		// Output
		System.out.println("The power of base " + base + " and exponent " + exponent + " is " + power);

	}

}
