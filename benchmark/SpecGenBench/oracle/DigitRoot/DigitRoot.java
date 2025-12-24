class DigitRoot {
    //@ requires num >= 0;
    //@ ensures \result >= 0 && \result < 10;
    public int digitRoot(int num) {
        //@ maintaining num >= 0;
        while (num >= 10) {
            int sum = 0;
            //@ maintaining num >= 0;
            //@ maintaining sum >= 0; 
            //@ decreases num;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        //@ assume num < 10;
        return num;
    }
}

