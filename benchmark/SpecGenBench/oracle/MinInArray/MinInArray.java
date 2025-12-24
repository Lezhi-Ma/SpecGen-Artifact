class MinInArray {
    //@ ensures \forall int i; 0 <= i && i < a.length; \result <= a[i];
    public int minElementInArray(int[] a) {
        if (a.length == 0) return -1;
        int res = Integer.MIN_VALUE;
        //@ maintaining (\forall int j; 0 <= j && j < i; res <= a[j]);
        //@ maintaining 0 <= i && i <= a.length;
        //@ decreases a.length - i;
        for(int i = 0; i < a.length; i++) {
            res = ((a[i] < res) ? a[i] : res);
        }
        return res;
    }
}
