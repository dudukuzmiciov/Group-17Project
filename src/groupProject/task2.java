package groupProject;

public class task2 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
				int [][] array =  new int [2][2];

		        int sum=0;

		        array [0][0] = 1;
		        array [0][1] = 2;
		        array [1][0] = 3;
		        array [1][1] = 4;

		        for (int i = 0; i < array.length; i++) {
		            for (int j = 0; j < array.length; j++) {
		            }
		        }
		        for (int i = 0; i < array.length; i++) {
		           for (int j = 0; j < array[i].length; j++) {
		                sum += array[i][j];
		           }
		        }
		        System.out.println("The sum of all elements of a 2D Array = "+sum);
	}

}
