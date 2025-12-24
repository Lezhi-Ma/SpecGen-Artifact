class IsAllUnique {
    boolean isAllUnique(String str) {
        int len = str.length();
        if (len > 26) {
            return false;
        }
        int num = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if ((num & (1 << index)) != 0) {
                return false;
            } else {
                num |= (1 << index);
            }
        }
        return true;
    }
}