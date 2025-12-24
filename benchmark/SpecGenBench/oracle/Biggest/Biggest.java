public class Biggest {

    //@ requires a != null;
    //@ ensures \result == -1 <==> a.length == 0;
    //@ ensures 0 <= \result && \result < a.length ==> (\forall int i; 0 <= i && i < a.length; a[i] <= a[\result]);
    public static int biggest(int[] a) {
        if (a.length == 0) return -1;

        int index = 0;
        int biggest = 0;

        //@ maintaining 0 <= index && index <= a.length;
        //@ maintaining 0 <= biggest && biggest < a.length;
        //@ maintaining (\forall int i; 0 <= i && i < index; a[i] <= a[biggest]);
        //@ decreases a.length - index;
        while (a.length - index > 0) {
            if (a[index] > a[biggest]) {
                biggest = index;
            }
            index = index + 1;
        }
        return biggest;
    }
}

