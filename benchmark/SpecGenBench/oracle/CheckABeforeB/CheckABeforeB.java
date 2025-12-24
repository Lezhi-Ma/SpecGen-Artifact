class CheckABeforeB {
    //@ requires s.length() >= 2;
    //@ requires (\forall int i; 0 <= i && i < s.length(); s.charAt(i) == 'a' || s.charAt(i) == 'b');
    //@ requires (\exists int i; 0 <= i && i <= s.length(); (\forall int j; 0 <= j && j < i; s.charAt(j) == 'a') && (\forall int k; i <= k && k < s.length(); s.charAt(k) == 'b'));
    //@ ensures \result == true;
    public boolean checkString(String s) {
        char[] chars = s.toCharArray();
        //@ assume (\forall int i; 0 <= i && i < chars.length; chars[i] == 'a' && chars[i] == 'b');
        int i = 0;
        //@ maintaining 0 <= i && i <= chars.length && (\forall int k; 0 <= k && k < i; chars[k] == 'a');
        //@ decreases chars.length - i;
        while (i < chars.length && chars[i] == 'a') {
            i++;
        }
        int j = i;
        //@ maintaining i <= j && j <= chars.length && (\forall int k; i <= k && k < j; chars[k] == 'b');
        //@ decreases chars.length - j;
        while (j < chars.length && chars[j] == 'b') {
            j++;
        }
        return j == chars.length;
    }
}
