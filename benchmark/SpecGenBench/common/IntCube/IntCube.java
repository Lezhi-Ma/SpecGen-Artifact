public class IntCube {

    public static int cubeOf(int x) {
        boolean neg = false;
        if(x < 0) {
            neg = true;
            x = -x;
        }
        int res = 0;
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < x; j++) {
                for(int k = 0; k < x; k++) {
                    res = res + 1;
                }
            }
        }
        return (neg ? -res : res);
    }

}