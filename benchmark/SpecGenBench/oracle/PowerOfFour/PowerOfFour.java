class PowerOfFour {
    //@ ensures \result <==> (n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0);
    public /*@ pure @*/ boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}
