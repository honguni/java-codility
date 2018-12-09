package lesson.timecomplexity;

import java.util.stream.IntStream;

public class TapeEquilibrium {
    public int solution(int[] A) {
    	int left = 0;
    	int right = IntStream.of(A).reduce(0, (a, b) -> a + b);
    	int min = Integer.MAX_VALUE;

    	int result = 0;
    	int i = 0;
    	while(i < A.length - 1) {
    		left += A[i];
    		right -= A[i];
    		
    		result = left - right;
    		
    		if (result < 0) {
    			result = -result;
    		}
    		
    		if (result < min) {
    			min = result;
    		}
    		
    		if (min == 0) {
    			break;
    		}
    		
    		i++;
    	}
    	
        return min;
    }
}
