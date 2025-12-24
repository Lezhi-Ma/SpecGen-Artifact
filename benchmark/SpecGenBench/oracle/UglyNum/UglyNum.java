class UglyNum {
    //@ ensures (n <= 0) ==> (\result == false);
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        //@ ghost int old_old_n = n;
        int[] factors = {2, 3, 5};
        //@ maintaining 1 <= n;
        //@ maintaining 0 <= i && i <= 3;
        //@ maintaining factors[0] == 2 && factors[1] == 3 && factors[2] == 5;
        //@ maintaining 1 <= n && n <= old_old_n;
        //@ decreases 3 - i;
        for (int i = 0; i < factors.length; i++) {
            int factor = factors[i];
            //@ ghost int n_last = n * factor;
            //@ maintaining n >= 1 && n <= n_last;
            //@ maintaining n_last == n * factor;
            //@ decreases n - ((n % factor == 0) ? (n / factor) : n);
            while (n % factor == 0) {
                //@ set n_last = n;
                n /= factor;
            }
            //@ assume n % factor != 0;
            //@ set old_old_n = n;
        }
        return n == 1;
    }
}
