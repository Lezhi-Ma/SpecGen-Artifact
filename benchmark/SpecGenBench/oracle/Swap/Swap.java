public class Swap {
    //@ requires 0 <= a && a < arr.length;
    //@ requires 0 <= b && b < arr.length;
    //@ ensures \old(arr[a]) == arr[b] && \old(arr[b]) == arr[a];
    public static void swap (int[] arr, int a, int b) {
        if(a >= arr.length || a < 0 || b >= arr.length || b < 0) {
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}