package groupProject;

public class task4 {

	public static void main(String[] args) {
		// Create a 2D array of integers.
				// Develop a program which will calculate the sum of even and odd numbers for
				// that array.
				
				int[][] array = {{4, 3, 5, 9}, {6, 3, 1}, {1, 6, 4}};
		        int sumEven = 0;
		        int sumOdd = 0;
		        for (int i = 0; i < array.length; i++)
		            for (int j = 0; j < array[i].length; j++)
		                if (array[i][j] % 2 == 0)
		                    sumEven = sumEven + array[i][j];
		                    else if (array[i][j]%2!=0)
		                        sumOdd = sumOdd + array[i][j];
		        {
		            System.out.println("The sum of  even numbers is " + sumEven + "\nThe sum of odd numbers is " + sumOdd);
		        }

	}

}
