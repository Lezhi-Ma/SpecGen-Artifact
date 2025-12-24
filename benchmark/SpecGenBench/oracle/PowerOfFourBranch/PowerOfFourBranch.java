class PowerOfFourBranch {
    //@ ensures \result <==> (n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0);
    public boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        }
        if((n & (n - 1)) != 0) {
            return false;
        }
        if((n & 0xaaaaaaaa) != 0) {
            return false;
        }
        return true;
    }
}
