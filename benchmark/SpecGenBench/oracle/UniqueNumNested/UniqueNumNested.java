public class UniqueNumNested {
    //@ requires arr != null;
    //@ requires arr.length >= 1;
    //@ ensures (0 <= \result && \result < arr.length) ==> (\forall int k; 0 <= k && k < arr.length; (\result != k) ==> (arr[\result] != arr[k]));
    public static int uniqueNum(int[] arr) {
        //@ maintaining 0 <= i && i <= arr.length;
        //@ maintaining (\forall int j; 0 <= j && j < i; (\exists int k; 0 <= k && k < arr.length; j != k && arr[j] == arr[k]));
        //@ decreases arr.length - i;
        for (int i = 0; i < arr.length; ++i) {
            int j = 0;
            //@ maintaining 0 <= j && j <= arr.length;
            //@ maintaining (\forall int k; 0 <= k && k < j; (i != k) ==> (arr[i] != arr[k]));
            //@ decreases arr.length - j;
            while(j < arr.length) {
                if(i != j && arr[i] == arr[j])
                    break;
                j++;
            }
            if(j == arr.length) {
                //@ assert (\forall int k; 0 <= k && k < arr.length; (i != k) ==> (arr[i] != arr[k]));
                return i;
            }
        }
        return -1;
    }
    
}
