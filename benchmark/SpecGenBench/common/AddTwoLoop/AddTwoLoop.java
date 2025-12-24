public class AddTwoLoop {
    public static int add(int a, int b) {
        int m = ((a < 0) ? -a : a);
        int n = ((b < 0) ? -b : b);
        int res = 0;
        for(int i = 0; i < m; i++){
            res = res + ((a < 0) ? -1 : 1);
        }
        for(int i = 0; i < n; i++){
            res = res + ((b < 0) ? -1 : 1);
        }
        return res;
    }
}
