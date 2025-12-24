public class CopyArray {
 
    public static void CopyArray(int[] b, int iBegin, int iEnd, int[] a) {
        int k = iBegin;

        while (iEnd - k > 0) {
            a[k] = b[k];
            k = k + 1 ;
        }
    }
}

