package p0006SquareRoot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variables
		SquareRoot sqtRoot = null;
		Scanner scanner = new Scanner(System.in);
		int radicand = 0;
		int root = 0;

		// Input
		System.out.println("Square root - using integers.");
		System.out.println("===============================================");
		System.out.println("Radicand: ");
		radicand = scanner.nextInt();

		// Process
		root = sqtRoot.squareRoot(radicand);

		// Output
		System.out.println("The root of " + radicand + " is " + root + ".");

	}

}
