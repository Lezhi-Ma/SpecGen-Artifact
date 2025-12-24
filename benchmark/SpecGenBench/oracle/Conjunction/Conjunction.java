public class Conjunction {
    //@ ensures \result == (b1 && b2);
    public static boolean conjunctOf(boolean b1, boolean b2) {
        if(b1 == false)
            return false;
        if(b2 == false)
            return false;
        return true;
    }
}
