class IsSubsequence {
    //@ requires s != null && t != null;
    //@ ensures \result ==> (\forall int i; 0 < i && i < s.length(); (\exists int j; 0 <= j && j <= t.length(); s.charAt(i) == t.charAt(j)));  
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        //@ maintaining 0 <= i && i <= n && 0 <= j && j <= m;
        //@ maintaining (\forall int k; 0 <= k && k < i; (\exists int l; 0 <= l && l < m; s.charAt(k) == t.charAt(l)));
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
