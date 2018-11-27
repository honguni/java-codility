package lesson.arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        final int lengthA = A.length;
        int[] cloneA = A.clone();
        
        if (lengthA != K) {
            while(K > 0) {
                int nextIndex = 0;
                
                for(int i = 0; i < lengthA ; i++) {
                    nextIndex = (i + 1) % lengthA;
                    A[nextIndex] = cloneA[i];
                }
                
                cloneA = A.clone();
                K--;
            }
        }
        
        return A;
    }
}
