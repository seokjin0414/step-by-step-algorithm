package C2;

import java.lang.reflect.Array;

public class ex2_3 {

    public int maxN( int[] A) {
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

}
