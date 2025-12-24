public class IsAscending {
    //@ ensures \result == true <==> (\forall int i; 0 <= i && i < arr.length - 1; arr[i] < arr[i+1]);
    public boolean isAscending (int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return true;
        }
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining (\forall int j; 0 <= j && j < i; arr[j] < arr[j+1]);
        //@ decreases n - i;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] >= arr[i+1])
                return false;
        }
        return true;
    }
}

