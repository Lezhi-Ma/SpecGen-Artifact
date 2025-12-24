public class XOR {
    public static boolean xor(boolean b1, boolean b2) {
        if(b1 == true) {
            if(b2 == true) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            if(b2 == true) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
