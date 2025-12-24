public class UniqueCharNested {
    //@ requires s != null;
    //@ requires s.length() >= 1;
    //@ ensures (\forall int j; 0 <= j && j < s.length(); (\exists int k; 0 <= k && k < s.length(); j != k && s.charAt(j) == s.charAt(k))) ==> (\result == -1);
    //@ ensures (0 <= \result && \result < s.length()) ==> (\forall int k; 0 <= k && k < s.length(); (\result != k) ==> (s.charAt(\result) != s.charAt(k)));
    public static int uniqueChar(String s) {
        //@ maintaining 0 <= i && i <= s.length();
        //@ maintaining (\forall int j; 0 <= j && j < i; (\exists int k; 0 <= k && k < s.length(); j != k && s.charAt(j) == s.charAt(k)));
        //@ decreases s.length() - i;
        for (int i = 0; i < s.length(); ++i) {
            int j = 0;
            //@ maintaining 0 <= j && j <= s.length();
            //@ maintaining (\forall int k; 0 <= k && k < j; (i != k) ==> (s.charAt(i) != s.charAt(k)));
            //@ decreases s.length() - j;
            while(j < s.length()) {
                if(i != j && s.charAt(i) == s.charAt(j))
                    break;
                j++;
            }
            if(j == s.length()) {
                //@ assert (\forall int k; 0 <= k && k < s.length(); (i != k) ==> (s.charAt(i) != s.charAt(k)));
                return i;
            }
        }
        return -1;
    }
    
}
