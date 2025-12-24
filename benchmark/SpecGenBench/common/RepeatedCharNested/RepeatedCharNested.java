public class RepeatedCharNested {

    public static int repeatedChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            for (int j = i + 1; j < s.length(); ++j) {
                char c2 = s.charAt(j);
                if(c1 == c2)
                    return i;
            }
        }
        return -1;
    }
    
}