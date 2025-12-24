public class SetZero {
    //@ requires 0 <= iBegin && iBegin < a.length;
    //@ requires 0 <= iEnd && iEnd < a.length;
	//@ requires iBegin < iEnd;
	//@ ensures (\forall int i; iBegin <= i && i < iEnd; a[i] == 0);
	public static void SetZero(int[] a, int iBegin, int iEnd) {
		int k = iBegin;
        //@ maintaining 0 <= k && k <= iEnd;
		//@ maintaining (\forall int i; iBegin <= i && i < k; a[i] == 0);
		//@ decreases iEnd - k;
		while (k < iEnd) {
            a[k] = 0;
            k = k + 1 ;
        }
	}
}
