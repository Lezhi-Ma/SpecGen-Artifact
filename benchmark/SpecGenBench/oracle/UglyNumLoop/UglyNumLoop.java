class UglyNumLoop {
    //@ ensures (n <= 0) ==> (\result == false);
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        //@ ghost int n_last = n * 2;
        //@ maintaining n >= 1 && n <= n_last;
        //@ maintaining n_last == n * 2;
        //@ decreases n - ((n % 2 == 0) ? (n / 2) : n);
        while (n % 2 == 0) {
            //@ set n_last = n;
            n /= 2;
        }
        //@ set n_last = n * 3;
        //@ maintaining n >= 1 && n <= n_last;
        //@ maintaining n_last == n * 3;
        //@ decreases n - ((n % 3 == 0) ? (n / 3) : n);
        while (n % 3 == 0) {
            //@ set n_last = n;
            n /= 3;
        }
        //@ set n_last = n * 5;
        //@ maintaining n >= 1 && n <= n_last;
        //@ maintaining n_last == n * 5;
        //@ decreases n - ((n % 5 == 0) ? (n / 5) : n);
        while (n % 5 == 0) {
            //@ set n_last = n;
            n /= 5;
        }
        return n == 1;
    }
}
