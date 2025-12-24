class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        int temp = n;
        while (temp != 0 && temp % 3 == 0) {
            temp /= 3;
        }
        return temp == 1;
    }
}
