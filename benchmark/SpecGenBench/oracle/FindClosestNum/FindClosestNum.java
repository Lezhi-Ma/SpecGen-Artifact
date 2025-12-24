class FindClosestNum {
    //@ requires nums.length >= 1;
    //@ ensures (\forall int j; 0 <= j && j < nums.length; (\result<0?-\result:\result) <= (nums[j]<0?-nums[j]:nums[j]));
    public int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE;
        //@ maintaining 0 <= i && i <= nums.length;
        //@ maintaining (\forall int j; 0 <= j && j < i; (ans<0?-ans:ans) <= (nums[j]<0?-nums[j]:nums[j]));
        //@ decreases nums.length - i;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int absNum = (num<0?-num:num);
            int absAns = (ans<0?-ans:ans);
            if(absNum < absAns || (absNum == absAns && num > ans)) {
                ans = num;
            }
        }

        return ans;
    }
}
