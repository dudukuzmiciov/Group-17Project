package groupProject;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// Create an array on int values using a scanner 
				//and calculate the sum of all stored elements in that array.
				
				Scanner input = new Scanner(System.in); 
		        System.out.println("Enter array length: ");
		        int size = input.nextInt(); 
		        int array[] = new int[size];
		        System.out.println("Insert array elements:");
		        
		        for (int i = 0; i < size; i++) {
		            array[i] = input.nextInt(); 
		        }
		        System.out.println ("Inserted array elements:");
		        for (int i = 0; i < size; i++) {
		            System.out.println (" " + array[i]); 
		        }
		        int sum = 0;
		        for (int i = 0; i < array.length; i = i + 1)
		        sum = sum + array[i];
		        System.out.println("The sum of all stored elements of array is: "+ sum);
		}



			


	}


