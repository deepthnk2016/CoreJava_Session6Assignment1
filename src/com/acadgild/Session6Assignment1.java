package com.acadgild;

/**
 * 
 * Objective - To initialize an array and add 10 integers.
 *             Retreive each element from array and check if its even number.
 *             If even number the display it in the console.
 *
 */
public class Session6Assignment1 {

	public static void main(String[] args) {

		// Initialize array of size 10
		int[] myarray = new int[10];

		// Loop and assign the elements of array.
		for (int i = 0; i <= 9; i++) {
			myarray[i] = i + 1;
		}

		System.out.println("Displaying Even Numbers from Array");

		// Loop through the array and check if its even number and display it.
		for (int i = 0; i < myarray.length; i++) {
			if (myarray[i] % 2 == 0) {
				System.out.println(myarray[i]);
			}

		}
	}

}
