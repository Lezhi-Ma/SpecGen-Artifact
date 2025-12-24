public class Absolute {
	/*@    requires 0 <= num && num <= Integer.MAX_VALUE;
	  @    ensures \result == num;
	  @ also
	  @    requires Integer.MIN_VALUE < num && num < 0;
	  @    ensures \result == -num; @*/
	public /*@ pure @*/ int Absolute(int num) {
		if (0 <= num)
			return num;
		else
			return -num;
	}

	/*@    requires 0 <= num && num <= Long.MAX_VALUE;
	  @    ensures \result == num;
	  @ also
	  @    requires  Long.MIN_VALUE < num && num < 0;
	  @    ensures \result == -num; @*/
	public /*@ pure @*/ long Absolute(long num) {
		if (0 <= num)
			return num;
		else
			return -num;	
	}
}
