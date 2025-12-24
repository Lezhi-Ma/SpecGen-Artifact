public class CopyArray {
    //@ requires 0 < a.length && 0 < b.length;
    //@ requires 0 <= iBegin && 0 <= iEnd && iBegin <= iEnd;
    //@ requires iBegin < a.length && iBegin < b.length && iEnd < a.length && iEnd < b.length;
    //@ ensures (\forall int i; iBegin <= i && i < iEnd; a[i] == b[i]);
    public static void CopyArray(int[] b, int iBegin, int iEnd, int[] a) {
        int k = iBegin;
        //@ maintaining iBegin <= k && k <= iEnd;
        //@ maintaining (\forall int i; iBegin <= i && i < k; a[i] == b[i]);
        //@ decreases iEnd  - k;
        while (iEnd - k > 0) {
            a[k] = b[k];
            k = k + 1 ;
        }
    }
}


