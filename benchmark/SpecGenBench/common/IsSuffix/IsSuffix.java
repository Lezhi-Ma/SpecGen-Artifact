public class IsSuffix {

    public boolean isSuffix (String pat, String txt) {
	
        int i = pat.length() - 1;

        while(i >= 0) {
	    int j = i - pat.length() + txt.length();
            if(j < 0 || pat.charAt(i) != txt.charAt(j))
                return false;
            i = i - 1;
        }

        return true;
    }

}
