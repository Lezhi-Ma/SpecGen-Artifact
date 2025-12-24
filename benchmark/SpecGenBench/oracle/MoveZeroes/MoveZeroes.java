class MoveZeroes {
    //@ public ghost int pivot = 0;
    //@ requires nums.length > 0;
    //@ ensures (\forall int i; 0 <= i && i < pivot; nums[i] != 0);
    public void moveZeroes(int[] nums) {
        //@ set pivot = 0;
        int n = nums.length, left = 0, right = 0;
        //@ maintaining 0 <= left && left <= n;
        //@ maintaining 0 <= right && right <= n;
        //@ maintaining 0 <= pivot && pivot <= n;
        //@ maintaining left <= right;
        //@ maintaining left == pivot;
        //@ maintaining (\forall int i; 0 <= i && i < left; nums[i] != 0);
        //@ decreases n - right;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                //@ assert nums[left] != 0;
                left++;
                //@ set pivot = pivot + 1;
                //@ assume left == pivot;
            }
            right++;
        }
        //@ assert (\forall int i; 0 <= i && i < left; nums[i] != 0);
        //@ assert (\forall int i; 0 <= i && i < pivot; nums[i] != 0);
    }

    //@ requires 0 <= left && left < nums.length;
    //@ requires 0 <= right && right < nums.length;
    //@ ensures \old(nums[left]) == nums[right] && \old(nums[right]) == nums[left];
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
