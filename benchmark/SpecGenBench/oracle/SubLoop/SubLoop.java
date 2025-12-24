public class SubLoop {
    //@ requires Integer.MIN_VALUE <= x - y && x - y <= Integer.MAX_VALUE;
    //@ ensures \result == x - y;
    public static int subLoop(int x, int y) {
        int sum = x;
        if (y > 0) {
            int n = y;
            //@ maintaining 0 <= n && n <= y;
            //@ maintaining sum == x + n - y;
            //@ decreases n;
            while (n > 0) {
                sum = sum - 1;
                n = n - 1;
            }
        } else {
            int n = -y;
            //@ maintaining 0 <= n && n <= -y;
            //@ maintaining sum == x - n - y;
            //@ decreases n;
            while (n > 0) {
                sum = sum + 1;
                n = n - 1;
            }
        }
        return sum;
    }
}
