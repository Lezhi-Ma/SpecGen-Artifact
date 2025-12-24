public class IsSuffix {

    //@ requires pat != null && txt != null;
    //@ requires pat.length() <= txt.length();
    //@ ensures \result == true <==> (\forall int k; 0 <= k && k <= pat.length() - 1; pat.charAt(k) == txt.charAt(k - pat.length() + txt.length()));
    public boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;
        //@ maintaining -1 <= i && i <= pat.length() - 1;  
        //@ maintaining (\forall int k; i+1 <= k && k <= pat.length() - 1; pat.charAt(k) == txt.charAt(k - pat.length() + txt.length()));
        //@ decreases i;
        while(i >= 0) {
	    int j = i - pat.length() + txt.length();
            if(j < 0 || pat.charAt(i) != txt.charAt(j))
                return false;
            i = i - 1;
        }

        return true;
    }
}
