
class RotateArray {
    //@ requires nums.length > 0 && k >= 0; 
    //@ ensures (\forall int j; 0 <= j && j < nums.length; \old(nums[j]) == nums[(j + k) % nums.length]);
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining 0 <= (i + k) % n && (i + k) % n < n;
        //@ maintaining (\forall int j; 0 <= j && j < i; nums[j] == newArr[(j + k) % n]);
        //@ decreases n - i;
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}
