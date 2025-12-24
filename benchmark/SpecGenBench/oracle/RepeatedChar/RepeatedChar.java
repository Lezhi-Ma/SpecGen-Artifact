import java.util.HashSet;
import java.util.Set;

class RepeatedChar {
    //@ requires s != null;
    //@ requires (\forall int i; 0 < i && i < s.length(); s.charAt(i) != ' ');
    //@ ensures (\result != ' ') ==> (\exists int i; 0 <= i && i < s.length(); \result == s.charAt(i) && (\exists int j; 0 <= j && j < i; s.charAt(j) == \result));  
    public /*@ pure @*/ char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<Character>();
        //@ maintaining 0 <= i && i <= s.length();
        //@ maintaining (\forall int j; 0 <= j && j < i; (\forall int k; 0 <= k && k < j; s.charAt(j) != s.charAt(k)));
        //@ decreases s.length() - i;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen.add(ch)) {
                //@ assume (\exists int k; 0 <= k && k < i; s.charAt(i) == s.charAt(k))
                return ch;
            }
            //@ assume (\forall int j; 0 <= j && j <= i; (\forall int k; 0 <= k && k < j; s.charAt(j) != s.charAt(k)));
            //@ assume (\forall int j; 0 <= j && j <= i; seen.contains(s.charAt(j)) == true);
        }
        // impossible
        return ' ';
    }
}