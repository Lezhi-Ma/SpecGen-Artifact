class NumberOfCutsSeq {
    //@ ensures (n == 1) ==> (\result == 0);
    //@ ensures (n != 1 && n % 2 == 0) ==> (\result == n/2);
    //@ ensures (n != 1 && n % 2 != 0) ==> (\result == n);
    public int numberOfCuts(int n) {
        return ((n == 1) ? 0 : ((n % 2 == 0) ? (n / 2) : n));
    }
}
