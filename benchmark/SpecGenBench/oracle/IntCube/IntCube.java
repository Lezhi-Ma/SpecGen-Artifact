public class IntCube {
    //@ ensures \result == x * x * x;
    public static int cubeOf(int x) {
        boolean neg = false;
        if(x < 0) {
            neg = true;
            x = -x;
        }
        //@ assert (neg <==> (\old(x) < 0));
        int res = 0;
        //@ maintaining 0 <= i && i <= x;
        //@ decreases x - i;
        //@ maintaining res == i * x * x;
        for(int i = 0; i < x; i++) {
            //@ maintaining 0 <= j && j <= x;
            //@ decreases x - j;
            //@ maintaining res == i * x * x + j * x;
            for(int j = 0; j < x; j++) {
                //@ maintaining 0 <= k && k <= x;
                //@ decreases x - k;
                //@ maintaining res == i * x * x + j * x + k;
                for(int k = 0; k < x; k++) {
                    res = res + 1;
                }
            }
        }
        return (neg ? -res : res);
    }

}
