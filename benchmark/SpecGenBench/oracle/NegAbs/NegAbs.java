public class NegAbs {
	//@ ensures \result == ((num < 0) ? num : -num);
	public int negAbs(int num) {
		if (num < 0)
			return num;
		else
			return -num;
	}

}
