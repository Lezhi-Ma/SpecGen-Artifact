class ReverseString {
    //@ public ghost char[] old_s = {};
    //@ requires s.length >= 1;
    //@ ensures (\forall int i; 0 <= i && i < s.length; s[i] == old_s[s.length - i - 1]);
    public void reverseString(char[] s) {
        //@ set old_s = s.clone();
        //@ assume (\forall int i; 0 <= i && i < s.length; s[i] == old_s[i]);
        int n = s.length;
        //@ maintaining 0 <= left && left <= right + 1;
        //@ maintaining left - 1 <= right && right < n;
        //@ maintaining left + right == n - 1;
        //@ maintaining (\forall int i; 0 <= i && i < left; s[i] == old_s[n - i - 1]);
        //@ maintaining (\forall int i; right < i && i < n; s[i] == old_s[n - i - 1]);
        //@ decreases n - left;
        //@ decreases right;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            //@ assume s[left] == old_s[n - left - 1];
            //@ assume s[right] == old_s[n - right - 1];
        }
        //@ assume (\forall int i; 0 <= i && i < s.length; s[i] == old_s[s.length - i - 1]);
    }
}
