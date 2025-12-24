public class AddLoopFor {
    //@ requires Integer.MIN_VALUE <= x + y && x + y <= Integer.MAX_VALUE && y != Integer.MIN_VALUE;
    //@ ensures \result == x + y;
    public static int addLoop(int x, int y) {
        int sum = y;
        if (x > 0) {
            //@ decreases n;
            //@ maintaining sum == x + y - n && 0 <= n;
            for(int n = x; n > 0; n = n - 1) {
                sum = sum + 1;
            }
        } else {
            //@ maintaining sum == x + y + n && 0 <= n;
            //@ decreases n;
            for(int n = -x; n > 0; n = n - 1) {
                sum = sum - 1;
            }
        }
        return sum;
    }
}
