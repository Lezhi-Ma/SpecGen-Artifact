class MySqrt {
    //@ requires 0 <= x && x <= Integer.MAX_VALUE;
    //@ requires (\exists int i; 0 <= i && i <= x; i * i == x);
    //@ ensures \result * \result == x
    public /*@ pure @*/ int mySqrt(int x) {
        int l = 0, r = x, ans = l + (r - l) / 2;
        //@ maintaining l <= r + 1;
	//@ maintaining (\forall int i; 0 <= i && i < l; i * i <= x);
	//@ maintaining (\forall int j; r < j && j <= x; j * j >= x);
        //@ maintaining l <= ans && ans <= r;
        //@ decreases r - l;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
