class PrimeCheck {
    //@ requires a >= 2;
    //@ ensures \result <==> (\forall int i; 2 <= i && i <= a/2; a % i != 0);
    public /*@ pure @*/ boolean isPrime(int a) {
        int i = 2;
        int mid = a/2;
        //@ maintaining 2 <= i && i <= mid + 1;
        //@ maintaining (\forall int j; 2 <= j && j < i; a % j != 0);
        //@ decreases mid - i + 1;
        while (i <= mid) {
            if (a%i == 0)
                return false;
            i++;
        }
        return true;
    }
}

