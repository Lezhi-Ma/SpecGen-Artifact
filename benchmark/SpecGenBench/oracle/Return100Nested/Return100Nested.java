public class Return100Nested {
    //@ ensures \result == 100;
    public static int return100 () {
        int res = 0;
        //@ maintaining 0 <= i && i <= 10;
        //@ maintaining res == i * 10;
        //@ decreases 10 - i;
        for(int i = 0; i < 10; i++) {
            //@ maintaining 0 <= j && j <= 10;
            //@ maintaining res == i * 10 + j;
            //@ decreases 10 - j;
            for(int j = 0; j < 10; j++) {
                res = res + 1;
            }
        }
        return res;
    }
}
