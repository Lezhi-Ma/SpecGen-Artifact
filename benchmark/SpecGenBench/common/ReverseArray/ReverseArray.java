public class ReverseArray {
    public static int[] reverse(int[] original) {
        int n = original.length;
        int[] res = new int[n];
        for(int i = 0; i < n ; i++) {
            res[i] = original[n - i - 1];
        }
        return res;
    }
}
