public class LCM {
    /*@ public normal_behavior     
      @    requires d != 0;
      @    ensures \result == n%d;
      @    pure function @*/
    public static int div(int n, int d) { return n%d; }

    /*@ requires num1 != Integer.MIN_VALUE;
      @ requires num2 != Integer.MIN_VALUE;
      @ {|
      @    requires num1 != 0 && num2 != 0;
      @    old int pNum1 = (num1 > 0) ? num1 : -num1;
      @    old int pNum2 = (num2 > 0) ? num2 : -num2;
      @    old int max = (pNum1 > pNum2) ? pNum1 : pNum2;
      @    ensures \result == -1 || 0 < \result; 
      @    ensures 0 < \result ==> (div(\result, pNum2) == 0 && div(\result, pNum2) == 0);
      @    ensures 0 < \result ==> (\forall int i; max <= i && i < \result; div(i, pNum1) == 0 ==> div(i, pNum2) != 0);
      @    ensures \result == -1 ==> (\forall int k; max <= k && k <= Integer.MAX_VALUE; div(k, pNum1) == 0 ==> div(k, pNum2) != 0); 
      @ also
      @    requires num1 == 0 || num2 == 0;
      @    ensures \result == -1;
      @ |} @*/
    public /*@ pure @*/ int lcm(int num1, int num2) 
    {
	if (num1 == 0 || num2 == 0) {
		return -1;
	}	
	if (num1 < 0)
		num1 = -num1;
	if (num2 < 0)
		num2 = -num2;

        int result = (num1 > num2) ? num1 : num2;
	
	//@ ghost int check = result; 
	//@ maintaining num1 <= result && num2 <= result && result <= Integer.MAX_VALUE;
	//@ maintaining (\forall int k; check <= k && k < result; div(k, num1) == 0 ==> div(k, num2) != 0);
	//@ decreases Integer.MAX_VALUE - result;
        while (result < Integer.MAX_VALUE)
        {
            if (div(result, num1) == 0 && div(result, num2) == 0)
            {
                break;
            }
            result++;
        }

	if (div(result, num1) == 0 && div(result, num2) == 0) {
		return result;
	}
	return -1;
    }
}

