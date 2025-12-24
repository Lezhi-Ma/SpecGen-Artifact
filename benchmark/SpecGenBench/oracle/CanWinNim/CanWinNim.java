class CanWinNim {
    //@ ensures \result <==> (n % 4 != 0);
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
