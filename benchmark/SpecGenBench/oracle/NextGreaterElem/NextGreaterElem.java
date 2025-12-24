class NextGreaterElem {
    //@ requires 0 < nums1.length && nums1.length <= nums2.length;
    //@ requires (\forall int i; 0 <= i && i < nums1.length; (\exists int j; 0 <= j && j <= nums2.length; nums1[i] == nums2[j]));
    //@ ensures \result.length == nums1.length;
    //@ ensures (\forall int i; 0 <= i && i < \result.length; \result[i] != -1 ==> \result[i] > nums1[i]);
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] res = new int[m];
        //@ maintaining 0 <= i && i <= m;
        //@ maintaining (\forall int j; 0 <= j && j < i; res[j] != -1 ==> res[j] > nums1[j]);
        //@ decreases m - i;
        for (int i = 0; i < m; ++i) {
            int j = 0;
            //@ maintaining 0 <= j && j <= n;
            //@ decreases n - j;
            while (j < n && nums2[j] != nums1[i]) {
                ++j;
            }
            //@ assume j != n;
            //@ assume nums2[j] == nums1[i];
            int k = j + 1;
            //@ maintaining j < k && k <= n;
            //@ decreases n - k;
            while (k < n && nums2[k] < nums2[j]) {
                ++k;
            }
            //@ assume k == n || nums2[k] >= nums2[j];
            res[i] = k < n ? nums2[k] : -1;
            //@ assume res[i] != -1 ==> res[i] > nums1[i];
        }
        return res;
    }
}
