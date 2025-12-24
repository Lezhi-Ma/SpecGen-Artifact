public class ReLUSeq {
    //@ ensures \result == ((x >= 0 ? x : 0.0));
    public static double computeReLU(double x) {
        return ((x >= 0) ? x : 0);
    }
}