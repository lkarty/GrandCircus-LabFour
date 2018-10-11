package com.ForthLab;

import java.util.Scanner;

public class PowersTable {

	private static Scanner scnr;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long i;
		long usrNum = 0;
		long numSquare = 0;
		long numCubed = 0;
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

		System.out.println("Enter an interger from 1 to 10");
		usrNum = scan.nextInt();
		
			System.out.printf("%-10s %-12s %-14s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-12s %-14s", "=======", "=======", "======");

		for (i = 1; i <= usrNum; i++) {

			numSquare = i * i;
			numCubed = i * numSquare;

				System.out.printf("\n%-10d  %-10d  %-10d", i, numSquare, numCubed);
		}
			// this is where your code should end
		
			System.out.println("\nDo you want to continue? (y/n)");
			cont = scan.next();
		}
		System.out.println("Goodbye");
		scan.close();
	}

}
