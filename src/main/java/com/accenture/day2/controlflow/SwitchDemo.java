package com.accenture.day2.controlflow;

import java.util.Scanner;

public class SwitchDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a color: ");
		String color = scanner.nextLine();
		
		switch (color.toLowerCase()) {
		case "blue":
		case "orange":
			System.out.println("The color is either blue or orange.");
			break;
		case "white":
			System.out.println("The color is white.");
		case "red":
			System.out.println("The color is red.");
			break;
		default:
			System.out.println("Cannot define the color!");
			break;
		}
		
		
		int[] sampleArray = {1,2,6,8,6,4,8};
	}

}
