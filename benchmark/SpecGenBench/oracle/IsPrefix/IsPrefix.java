public class IsPrefix {
    //@ ensures \result <==> (\forall int i; 0 <= i && i < pat.length(); i < txt.length() && pat.charAt(i) == txt.charAt(i));
    public boolean isPrefix (String pat, String txt) {
        int i = 0;
        //@ maintaining 0 <= i && i <= pat.length();
        //@ maintaining (\forall int j; 0 <= j && j < i; j < txt.length() && pat.charAt(j) == txt.charAt(j));
        //@ decreases pat.length() - i;
        while(i < pat.length()) {
            if(i >= txt.length() || pat.charAt(i) != txt.charAt(i))
                return false;
            i = i + 1;
        }

        return true;
    }

}


