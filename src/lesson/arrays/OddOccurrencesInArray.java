package lesson.arrays;

import java.util.HashSet;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
    	HashSet<Integer> hashSet = new HashSet<Integer>();
    	
    	for (int i : A) {
    		if (hashSet.contains(i)){
    			hashSet.remove(i);
    		} else {
    			hashSet.add(i);
    		}
    	}
    	
		return hashSet.iterator().next();
    }
}
