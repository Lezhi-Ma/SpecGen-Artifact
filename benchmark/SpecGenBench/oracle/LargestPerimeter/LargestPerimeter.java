import java.util.Arrays;

class LargestPerimeter {
    //@ requires A.length >= 3;
    //@ requires (\forall int i; 0 <= i && i < A.length; A[i] > 0);
    // ensures \result == 0 || (\exists int i; 2 <= i && i < A.length; \result == A[i - 2] + A[i - 1] + A[i]);
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        //@ maintaining 1 <= i && i < A.length;
        //@ maintaining (\forall int j; i < j && j < A.length; A[j - 2] + A[j - 1] <= A[j]);
        //@ decreases i - 1;
        for (int i = A.length - 1; i >= 2; --i) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }
}
