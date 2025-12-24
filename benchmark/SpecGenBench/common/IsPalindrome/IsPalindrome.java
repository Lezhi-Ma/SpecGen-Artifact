class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
