class MyPower {
    //@ ensures \result == spec_power(x, n);
    public static int power(int x, int n) {
        int res = 1;
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining res == spec_power(x, i);
        //@ decreases n - i; 
        for(int i = 0; i < n; i++)
            //@ assume Integer.MIN_VALUE <= res * x && res * x <= Integer.MAX_VALUE;
	    res = res * x;
        return res;
    }
    /*@
    ensures (n > 0) ==> \result == x * spec_power(x, n - 1);
    ensures (n == 0) ==> \result == 1;
    model public static pure int spec_power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            assume Integer.MIN_VALUE <= x * spec_power(x, n - 1) && x * spec_power(x, n - 1) <= Integer.MAX_VALUE;
            return x * spec_power(x, n - 1);
        }
    }
    @*/
}
