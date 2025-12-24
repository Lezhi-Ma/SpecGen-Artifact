public class ThreeConsecutiveOdds {
    //@ requires arr.length >= 3;
    //@ ensures (\result == false) <==> (\forall int j; 0 <= j < arr.length - 2; (arr[j] & 1) == 0 || (arr[j + 1] & 1) == 0 || (arr[j + 2] & 1) == 0);
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        //@ maintaining 0 <= i && i <= n - 2;
        //@ decreasing n - i - 2;
        //@ maintaining (\forall int j; 0 <= j < i; (arr[j] & 1) == 0 || (arr[j + 1] & 1) == 0 || (arr[j + 2] & 1) == 0);
        for (int i = 0; i <= n - 3; ++i) {
            if ((arr[i] & 1) != 0 && (arr[i + 1] & 1) != 0 && (arr[i + 2] & 1) != 0) {
                return true;
            }
        }
        return false;
    }
}
