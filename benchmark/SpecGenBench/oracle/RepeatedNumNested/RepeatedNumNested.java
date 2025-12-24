public class RepeatedNumNested {
    //@ requires arr != null;
    //@ ensures \result == -1 || (\exists int i; 0 <= i && i < arr.length; i != \result && arr[i] == arr[\result]);
    public static int repeatedNum(int[] arr) {
        //@ maintaining 0 <= i && i <= arr.length;
        //@ maintaining (\forall int k; 0 <= k && k < i; (\forall int j; i <= j && j < arr.length; arr[k] != arr[j]));
        //@ decreases arr.length - i;
        for (int i = 0; i < arr.length; ++i) {
            //@ maintaining i + 1 <= j && j <= arr.length;
            //@ maintaining (\forall int k; i < k && k < j; arr[i] != arr[k]);  
            //@ decreases arr.length - j;
            for (int j = i + 1; j < arr.length; ++j) {
                if(arr[i] == arr[j])
                    return i;
            }
        }
        return -1;
    }
}

