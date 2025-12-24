public class Abs {
	//@ ensures \result == ((num < 0) ? -num : num);
	public int Abs(int num) {
		if (num < 0)
			return -num;
		else
			return num;
	}

}
