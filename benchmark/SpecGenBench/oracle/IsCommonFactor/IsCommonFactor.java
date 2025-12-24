public class IsCommonFactor {
    //@ requires factor != 0;
    //@ ensures \result <==> (a % factor == 0 && b % factor == 0);
    public boolean isCommonFactor (int a, int b, int factor) {
        return a % factor == 0 && b % factor == 0;
    }
}
