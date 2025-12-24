class SmallestEvenMul {
    //@ ensures \result == (n % 2 == 0 ? n : 2 * n);
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : 2 * n;
    }
}