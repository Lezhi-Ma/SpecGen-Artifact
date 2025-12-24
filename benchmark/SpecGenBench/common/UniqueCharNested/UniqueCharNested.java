public class UniqueCharNested {

    public static int uniqueChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            int j = 0;
            while(j < s.length()) {
                if(i != j && s.charAt(i) == s.charAt(j))
                    break;
                j++;
            }
            if(j == s.length())
                return i;
        }
        return -1;
    }
    
}
