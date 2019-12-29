import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    static int solution(Integer[] A) {
        int studentLineLength = A.length;
        int[][] arr = new int[studentLineLength][studentLineLength];
        int rows = 0;
        
	    
	    for (int x = 0; x < studentLineLength; x++) {
            int currentStudentWaiting = A[x];
            
            for (int i = 0; i < arr.length; i++) {
                int minRowValue = 5;
                int nextI = 0;
                int nextJ = 0;
    			
                for (int j = 0; j < arr[i].length; j++) {
                    int currentIterator = A[x];
                    int columnLength = arr[i].length;
                    
                    
                    if (currentIterator <= minRowValue) {
                        minRowValue = currentIterator;
    					System.out.println("min row value is: " + minRowValue);
    				}
    				if (arr[0][0] == 0 ) {
    					arr[0][0] = currentStudentWaiting;
    					rows++;
    				} else if (currentStudentWaiting <= minRowValue) {
    					nextJ = j + 1;
    					if(nextJ <= columnLength ) {
                            arr[i][nextJ] = currentStudentWaiting;
                        }
                        nextJ = 0;
    				} else {
    					if(nextI < arr.length) {
    						arr[i+1][j] = currentStudentWaiting;
    						rows++;
    					}
    					nextI = 0;
    				}
    			}
            } 
        }	
    return 0;
  }

  public static void main(String[] args) {
    // Read from stdin, solve the problem, write answer to stdout.
    Scanner in = new Scanner(System.in);
    Integer[] A = getIntegerArray(in.next());
    
    solution(A);
    
  }

  private static Integer[] getIntegerArray(String str) {
    return Stream.of(str.split("\\,"))
          .map(Integer::valueOf)
          .toArray(Integer[]::new);
  }
}