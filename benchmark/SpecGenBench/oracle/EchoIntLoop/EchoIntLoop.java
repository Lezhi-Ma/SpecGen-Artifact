public class EchoIntLoop {
    //@ ensures x < 0 ==> (\result == 0);
    //@ ensures x >= 0 ==> (\result == x);
    public static int echo(int x) {
        int res = 0;
        //@ maintaining x < 0 ==> res == 0;
        //@ maintaining x >= 0 ==> (i >= 0 && i <= x);
        //@ decreases x - i;
        //@ maintaining res == i;
        for(int i = 0; i < x; i++) {
            res = res + 1;
        }
        return res;
    }
}
