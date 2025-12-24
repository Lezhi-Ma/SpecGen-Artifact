class NumberOfCuts {
    //@ ensures (n == 1) ==> (\result == 0);
    //@ ensures (n != 1 && n % 2 == 0) ==> (\result == n/2);
    //@ ensures (n != 1 && n % 2 != 0) ==> (\result == n);
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return n / 2;
        }
        return n;
    }
}
