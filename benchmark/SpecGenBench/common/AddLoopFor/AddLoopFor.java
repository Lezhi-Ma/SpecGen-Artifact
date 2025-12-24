public class AddLoopFor {
    public static int addLoop(int x, int y) {
        int sum = y;
        if (x > 0) {
            for(int n = x; n > 0; n = n - 1) {
                sum = sum + 1;
            }
        } else {
            for(int n = -x; n > 0; n = n - 1) {
                sum = sum - 1;
            }
        }
        return sum;
    }
}
