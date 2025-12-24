class JewelsInStones {
    //@ requires jewels.length() > 0 && stones.length() > 0;
    //@ requires (\exists int j; 0 <= j && j < stones.length(); (\exists int k; 0 <= k && k < jewels.length(); stones.charAt(j) == jewels.charAt(k)));
    //@ ensures \result > 0;
    public /*@ pure @*/ int numJewelsInStones(String jewels, String stones) {
        int jewelsCount = 0;
        int jewelsLength = jewels.length(), stonesLength = stones.length();
        //@ maintaining jewelsCount >= 0;
        //@ maintaining jewelsLength == jewels.length() && stonesLength == stones.length();
        //@ maintaining 0 <= i && i <= stonesLength;
        for (int i = 0; i < stonesLength; i++) {
            char stone = stones.charAt(i);
            //@ maintaining stone == stones.charAt(i);
            //@ maintaining jewelsCount >= 0;
            //@ maintaining jewelsLength == jewels.length() && stonesLength == stones.length();
            //@ maintaining 0 <= j && j <= jewelsLength;
            for (int j = 0; j < jewelsLength; j++) {
                char jewel = jewels.charAt(j);
                if (stone == jewel) {
                    jewelsCount++;
                    //@ assume jewelsCount > 0;
                    //@ assert stones.charAt(i) == jewels.charAt(j);
                    break;
                }
            }
        }
        //@ assume (\exists int j; 0 <= j && j < stones.length(); (\exists int k; 0 <= k && k < jewels.length(); stones.charAt(j) == jewels.charAt(k))) ==> (jewelsCount > 0);
        return jewelsCount;
    }
}
