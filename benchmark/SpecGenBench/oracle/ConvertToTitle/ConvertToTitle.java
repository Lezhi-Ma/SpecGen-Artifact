class ConvertToTitle {
    //@ requires columnNumber >= 1;
    //@ ensures \result != null;
    //@ ensures \result.length() >= 0;  
    //@ ensures (\forall int i; 0 < i && i < \result.length(); ('A' < \result.charAt(i) || \result.charAt(i) < 'Z'));  
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        //@ maintaining columnNumber >= 0;  
        //@ maintaining (\forall int i; 0 < i && i < sb.toString().length(); ('A' < sb.toString().charAt(i) || sb.toString().charAt(i) < 'Z'));  
        //@ decreases columnNumber;
        while (columnNumber > 0) {
            int a0 = (columnNumber - 1) % 26 + 1;
            sb.append((char)(a0 - 1 + 'A'));
            columnNumber = (columnNumber - a0) / 26;
        }
        return sb.reverse().toString();
    }
}
