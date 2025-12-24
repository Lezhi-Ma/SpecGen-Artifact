class IsAllUnique {
    //@ requires (\forall int i; 0 <= i && i < str.length(); 'a' <= str.charAt(i) && str.charAt(i) <= 'z');
    //@ ensures str.length() > 26 ==> !\result;
    //@ ensures \result ==> (\forall int k; 0 <= k && k < str.length(); (\forall int m; 0 <= m && m < k; str.charAt(m) != str.charAt(k)));
    boolean isAllUnique(String str) {
        int len = str.length();
        if (len > 26) {
            return false;
        }
        int num = 0;
        //@ maintaining 0 <= i && i <= len;
        //@ maintaining (\forall int k; 0 <= k && k < i; (num & (1 << (str.charAt(k) - 'a'))) != 0);
        //@ maintaining (\forall int k; 0 <= k && k < i; (\forall int m; 0 <= m && m < k; str.charAt(m) != str.charAt(k)));
        //@ decreases len - i;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if ((num & (1 << index)) != 0) {
                return false;
            } else {
                num |= (1 << index);
		//@ assert ((num & (1 << index)) != 0) <==> (\exists int k; 0 <= k && k <= i; str.charAt(k) - 'a' == index);
            }
        }
        return true;
    }
}
