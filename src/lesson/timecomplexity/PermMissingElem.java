package lesson.timecomplexity;

public class PermMissingElem {
    public int solution3_1(int[] A) {
    	boolean[] occurred = new boolean[A.length + 2];
    	
    	for(int i=0; i<A.length; i++) {
    		int occurredNumber = A[i];
    		occurred[occurredNumber] = true;
    	}
    	
    	int result = 0;
    	for(int i=1; i<occurred.length; i++) {
    		if(occurred[i] == false) {
    			result = i;
    			break;
    		}
    	}
    	
    	return result;
    }
}
