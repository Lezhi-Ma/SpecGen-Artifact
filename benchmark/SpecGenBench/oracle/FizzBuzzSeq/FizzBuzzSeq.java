class FizzBuzzSeq {
    //@ ensures (n % 3 != 0 && n % 5 != 0) <==> \result == 0;
    //@ ensures (n % 3 == 0 && n % 5 != 0) <==> \result == 3;
    //@ ensures (n % 3 != 0 && n % 5 == 0) <==> \result == 5;
    //@ ensures (n % 3 == 0 && n % 5 == 0) <==> \result == 8;
    public int fizzBuzz(int n) {
        int res = 0;
        res += ((n % 3 == 0) ? 3 : 0);
        res += ((n % 5 == 0) ? 5 : 0);
        return res;
    }
}
