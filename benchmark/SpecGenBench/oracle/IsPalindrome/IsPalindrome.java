class IsPalindrome {
    //@ requires s != null;
    //@ ensures \result <==> (\forall int i; 0 <= i && i < s.length(); s.charAt(i) == s.charAt(s.length() - 1 - i));
    public static boolean isPalindrome(String s) {
        //@ maintaining 0 <= i && i <= s.length();
        //@ maintaining (\forall int j; 0 <= j && j < i; s.charAt(j) == s.charAt(s.length() - 1 - j));
        //@ decreases s.length() - i;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}

