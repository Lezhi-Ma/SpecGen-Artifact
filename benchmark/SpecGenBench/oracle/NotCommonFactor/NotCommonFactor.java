public class NotCommonFactor {
    //@ requires factor != 0;
    //@ ensures \result <==> (a % factor != 0 || b % factor != 0);
    public boolean notCommonFactor (int a, int b, int factor) {
        return a % factor != 0 || b % factor != 0;
    }
}
