import java.util.Arrays;

public class SortLibrary {
    //@ ensures (\forall int i; 0 <= i && i < arr.length-1; arr[i] <= arr[i+1]);
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
