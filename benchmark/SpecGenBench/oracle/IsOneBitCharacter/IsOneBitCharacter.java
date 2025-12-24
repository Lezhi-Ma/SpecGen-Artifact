class IsOneBitCharacter {
    //@ requires bits.length > 1;
    //@ requires (\forall int i; 0 <= i && i <= bits.length; bits[i] == 0 || bits[i] == 1);
    //@ ensures (\forall int i; 0 <= i && i <= bits.length; bits[i] == 0 || bits[i] == 1);
    public /*@ pure @*/ boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        //@ maintaining 0 <= i && i <= n
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
