class IsMonotonic {
    //@ requires nums.length > 1;
    //@ ensures \result ==> ((\forall int j; 0 <= j && j < nums.length - 1; nums[j] <= nums[j+1]) || (\forall int j; 0 <= j && j < nums.length - 1; nums[j] >= nums[j+1]));
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        //@ maintaining 0 <= i && i <= n - 1;
        //@ maintaining inc ==> (\forall int j; 0 <= j && j < i; nums[j] <= nums[j+1]);
        //@ maintaining dec ==> (\forall int j; 0 <= j && j < i; nums[j] >= nums[j+1]);
        //@ decreases n - 1 - i;
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
