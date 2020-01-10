package sumOfPositive;

public class Positive {
	
	  public static int sum(int[] arr){
		  
		  int sum = 0;
		  
		  for(int number : arr) {
			  if (number > 0) {
				  sum += number;
				  

			  }
		  }

		  
		  
		    return sum;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,-9,1,-9 };
		
		
		
		System.out.println(sum(arr));

	}

}
