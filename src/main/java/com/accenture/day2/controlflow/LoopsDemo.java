package com.accenture.day2.controlflow;

public class LoopsDemo {
	/*
	 * Loops - repeats statement/s based on a given condition
	 * (initialization, condition, post loop)
	 * 1. For Loop
	 * 2. While Loop
	 * 3. Do-While Loop
	 */
	
	public static void main(String[] args) {
		System.out.println("FOR LOOP SAMPLE");
		for (int i = 0; i <= 24; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nWHILE LOOP SAMPLE");
		int j = 0;
		while (j <= 24) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.println("\nDO WHILE LOOP SAMPLE");
		int k = 0;
		do {
			System.out.print(k + " ");
			k++;
		} while (k <= 24);
	}

}
