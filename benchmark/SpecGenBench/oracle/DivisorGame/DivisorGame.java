public class DivisorGame {
    //@ ensures \result <==> n % 2 == 0;
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
