class FizzBuzz {
    //@ ensures (n % 3 != 0 && n % 5 != 0) <==> \result == 0;
    //@ ensures (n % 3 == 0 && n % 5 != 0) <==> \result == 3;
    //@ ensures (n % 3 != 0 && n % 5 == 0) <==> \result == 5;
    //@ ensures (n % 3 == 0 && n % 5 == 0) <==> \result == 8;
    public int fizzBuzz(int n) {
        int res = 0;
        if (n % 3 == 0) {
            res += 3;
        }
        if (n % 5 == 0) {
            res += 5;
        }
        return res;
    }
}
