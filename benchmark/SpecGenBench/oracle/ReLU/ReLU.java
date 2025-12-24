public class ReLU {
    //@ ensures \result == ((x >= 0 ? x : 0.0));
    public static double computeReLU(double x) {
        if(x >= 0) {
            return x;
        }
        return 0.0;
    }
}