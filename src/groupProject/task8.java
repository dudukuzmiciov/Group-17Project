package groupProject;

public class task8 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

				int[] numbers = {8,19,14,2001,18,48};
				
				int maxValue = numbers[0];
				
				  for(int i=1;i < numbers.length;i++){
				    if(numbers[i] > maxValue){
				      maxValue = numbers[i];
				    }
				  }
				  System.out.println("The maximum number in the array is "+ maxValue);
			    
					System.out.println("----------------------------------------");

				  int minValue = numbers[0];
				  
				  for(int i=1;i<numbers.length;i++){
				    if(numbers[i] < minValue){
				      minValue = numbers[i];
				    }
				  }
				  System.out.println("The minimum number in the array is "+ minValue);

	}

}
