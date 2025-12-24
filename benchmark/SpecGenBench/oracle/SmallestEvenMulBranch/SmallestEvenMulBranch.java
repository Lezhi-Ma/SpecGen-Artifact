class SmallestEvenMulBranch {
    //@ ensures \result == (n % 2 == 0 ? n : 2 * n);
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0) {
            return n;
        }
        return 2 * n;
    }
}