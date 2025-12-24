public class RepeatedCharNested {
    //@ requires s != null;
    //@ ensures \result == -1 || (\exists int i; 0 <= i && i < s.length(); i != \result && s.charAt(i) == s.charAt(\result));
    public static int repeatedChar(String s) {
        //@ maintaining 0 <= i && i <= s.length();
        //@ maintaining (\forall int k; 0 <= k && k < i; (\forall int j; i <= j && j < s.length(); s.charAt(k) != s.charAt(j)));
        //@ decreases s.length() - i;
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            //@ maintaining i < j && j <= s.length();
            //@ maintaining (\forall int k; i < k && k < j; s.charAt(i) != s.charAt(k));  
            //@ decreases s.length() - j;
            for (int j = i + 1; j < s.length(); ++j) {
                char c2 = s.charAt(j);
                if(c1 == c2)
                    return i;
            }
        }
        return -1;
    }
    
}