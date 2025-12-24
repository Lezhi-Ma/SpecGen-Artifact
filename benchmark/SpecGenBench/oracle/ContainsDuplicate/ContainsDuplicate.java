import java.util.Arrays;

public class ContainsDuplicate {

    /*@ public normal_behavior
      @    requires nums != null;
      @    requires (\forall int i; 0 <= i && i < nums.length; (int)Integer.MIN_VALUE <= nums[i] && nums[i] <= (int)Integer.MAX_VALUE);
      @    assignable \nothing;
      @    ensures \result <==> (\exists int i; 0 <= i && i < nums.length - 1; nums[i] == nums[i + 1]);
      @*/
    public boolean containsDuplicate(int[] nums) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int n = sortedNums.length;

        //@ maintaining 0 <= i && i <= n - 1;  
        //@ maintaining (\forall int j; 0 <= j && j < i; sortedNums[j] <= sortedNums[j + 1]);
        //@ decreases n - 1 - i;
        for (int i = 0; i < n - 1; i++) {
            if (sortedNums[i] == sortedNums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
