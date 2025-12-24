class PowerOfTwoLoop {
    //@ public ghost int old_n = 0;
    //@ public ghost boolean flag;
    //@ requires n >= 1;
    //@ ensures \result <==> (n > 0 && (n & (n - 1)) == 0);
    public boolean isPowerOfTwo(int n) {
        //@ set flag = (n > 0 && (n & (n - 1)) == 0);
        //@ set old_n = n;
        if(n <= 0) {
            return false;
        }
        //@ maintaining 1 <= n && n <= old_n;
        //@ maintaining flag <==> ((n & (n - 1)) == 0);
        //@ decreases n;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
