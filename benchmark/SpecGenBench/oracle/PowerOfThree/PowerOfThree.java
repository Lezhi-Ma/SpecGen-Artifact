class PowerOfThree {
    //@ public ghost int i = 0;
    //@ public ghost int[] arr = new int[19];
    //@ requires 0 < n && n <= Integer.MAX_VALUE;
    //@ ensures \result <==> (\exists int x; 0 <= x && x <= 19; arr[x] == n);
    public boolean isPowerOfThree(int n) {
        //@ set arr = new int[]{1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};   
        //@ set i = 1;
        int temp = n;
        //@ maintaining 1 <= temp && temp <= n;
        //@ maintaining temp * i == n;
        //@ maintaining 1 <= i && i <= n;
        //@ maintaining (\exists int x; 0 <= x && x <= 19; arr[x] == i);
        //@ decreases n - i;
        //@ decreases temp;
        while (temp != 0 && temp % 3 == 0) {
            temp /= 3;
            //@ set i = i * 3;
        }
        return temp == 1;
    }
}
