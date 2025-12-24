class TwoSum {
    //@ requires nums.length > 1;
    //@ ensures (\result.length == 0) ==> (\forall int a; 0 <= a && a < nums.length; (\forall int b; a + 1 <= b && b < nums.length; nums[a] + nums[b] != target));
    //@ ensures (\result.length == 2) ==> (nums[\result[0]] + nums[\result[1]] == target);
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        //@ maintaining 0 <= i && i <= n;
        //@ maintaining (\forall int a; 0 <= a && a < i; (\forall int b; a + 1 <= b && b < n; nums[a] + nums[b] != target));
        //@ decreases n - i;
        for (int i = 0; i < n; ++i) {
            //@ maintaining i + 1 <= j && j <= n;
            //@ maintaining (\forall int b; i + 1 <= b && b < j; nums[i] + nums[b] != target);
            //@ decreases n - j;
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
