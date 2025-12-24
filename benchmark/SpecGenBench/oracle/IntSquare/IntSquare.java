public class IntSquare {
    //@ ensures \result == x * x;
    public static int squareOf(int x) {
        if(x < 0)
            x = -x;
        int res = 0;
        //@ maintaining 0 <= i && i <= x;
        //@ decreases x - i;
        //@ maintaining res == i * x;
        for(int i = 0; i < x; i++) {
            //@ maintaining 0 <= j && j <= x;
            //@ decreases x - j;
            //@ maintaining res == i * x + j;
            for(int j = 0; j < x; j++) {
                res = res + 1;
            }
        }
        return res;
    }

}
