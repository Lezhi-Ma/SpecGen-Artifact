class PowerOfFourLoop {
    //@ requires 0 <= n && n <= Integer.MAX_VALUE;
    //@ ensures \result <==> (\old(n) > 0 && (\old(n) & (\old(n) - 1)) == 0 && (\old(n) & 0xaaaaaaaa) == 0);
    public boolean isPowerOfFour(int n) {
        //@ ghost boolean flag = (n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0);
        if(n <= 0) {
            return false;
        }
        //@ maintaining n >= 1;
        //@ maintaining flag <==> ((n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0);
        //@ decreases n;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

}
