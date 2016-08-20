/**
 * @author Aurko
 * @version 1.0
 */

import java.io.IOException;
import java.util.Scanner;

public class FindPi {
	public static void main(String args[] ) throws IOException {
		if( args.length == 0 ) {
			/*System.out.println("Enter a number: ");
			Scanner scan = new Scanner(System.in);
			int nthValueOfAccuracy = scan.nextInt();*/
			System.out.println("Value of PI through BBP formula: " +
					BBBPformula(1000));
		} else if ( args.length == 1) {

		} else {
			System.out.println("Usage java FindPi");
			System.out.println("Usage java FindPi [Nth digit of Pi]");
		}

	}

	/**
	 * this value of pi is calculated through the
	 * Bailey-Borwein-Plouffe formula
	 * @param n represents the nth digit of pi
	 * @return value of pi
	 */
	private static double BBBPformula(int n) {
		Double pi = 0.0;
		double k = 0;

		while (k < n) {
			pi += (1/Math.pow(16,k)) *
				((4/(8*k + 1)) -
				(2/(8*k + 4)) -
				(1/(8*k + 5)) -
				(1/(8*k + 6)));
			k++;
		}
		return pi;
	}

	/**
	 * Get Number of digits in a double
	 * @param getDigits
	 * @return
	 */
	private static int countDigits(Double getDigits){
		String[] splitDouble = getDigits.toString().split("\\.");
		return splitDouble[0].length() + splitDouble[1].length();
	}
}
