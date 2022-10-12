package com.accenture.day2;

public class ArrayDemo {
	
	//Array - can contain data in a single variable
	
	public static void main(String[] args) {
		//<dataType>[] variableName = {};
		int[] intArray = {36,6546,68,3,17,62,98,459};
//		for (int x = 0; x < intArray.length; x++) {
//			System.out.print(intArray[x] + " ");
//		}
		//enchanced for loop
		for (int y : intArray) {
			System.out.println(y + 1);
		}
		
		
		
		
		System.out.println("array length: " + intArray.length);
		System.out.println("call 68 from the array: " + intArray[2]);
		//System.out.println("inside intArray[8]: " + intArray[8]); -->error (Index 8 out of bounds for length 8)
		
		//String[] values	= {"java", "core", "bootcamp", "keyboard", "2", "a", "false"};//length of the values array = 4

		String[] nameArray = new String[2];
		nameArray[0] = "Toyota";
		nameArray[1] = "Chev";
		//nameArray[2] = "Lexus"; //--> error (Index 2 out of bounds for length 2)
		for (int i = 0; i < nameArray.length; ++i) {
			//1. i = 0; 2. 0<2=true; 3. sout =nameArray[0] = Toyota; 4. i++=1;
			//1. i = 1; 2. 1<2=true; 3. sout =nameArray[1] = Chev; 4. i++=2;
			//1. i = 2;	2. 2<=2=true   -----> loop terminated
			System.out.println(nameArray[i]);
		}
	}
	
}
