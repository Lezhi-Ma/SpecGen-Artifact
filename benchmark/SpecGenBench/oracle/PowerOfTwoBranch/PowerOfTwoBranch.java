class PowerOfTwoBranch {
    //@ ensures \result <==> (n > 0 && (n & (n - 1)) == 0);
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if ((n & (n - 1)) != 0) {
            return false;
        }
        return true;
    }
}
