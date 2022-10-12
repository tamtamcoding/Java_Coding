package com.accenture.day2.controlflow;

import java.util.Scanner;

public class IfDemo {
	
	/*
	 *Control Flow - change or break of flow within your code 
	 * 	-statements that handle the program or where you want the program to execute based on a given condition
	 *1. IF 
	 *2. Switch
	 *3. Loops
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter Age: ");
		int age = scan.nextInt();
		if (age == 0) {
			System.out.println("The input age is " + age + ".");
		}
		if (age < 0) {
			System.out.println("The input age is " + age + ". The age entered is either zero or negative.");
		} else if (age > 1 && age <= 17) {
			System.out.println("The input age is " + age + ". You are underage!");
		} else if (age > 17 && age <60) {
			System.out.println("The input age is " + age + ". You are in right age!");
		} else {
			System.out.println("The input age is " + age + ". You are old!");
		}
	}
}
