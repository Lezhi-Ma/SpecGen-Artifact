public class SetZero {

	public static void SetZero(int[] a, int iBegin, int iEnd) {
		int k = iBegin;

		while (k < iEnd) {
            		a[k] = 0;
            		k = k + 1 ;
        	}
	}
}
