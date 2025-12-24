public class ReverseArray {
    //@ requires original != null;
    //@ ensures (\forall int i; 0 <= i && i < original.length; \result[i] == original[original.length - i - 1]);
    public static int[] reverse(int[] original) {
        int n = original.length;
        int[] res = new int[n];
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining (\forall int j; 0 <= j && j < i; res[j] == original[n - j - 1]);
        //@ decreases n - i;
        for(int i = 0; i < n ; i++) {
            res[i] = original[n - i - 1];
        }
        return res;
    }
}
