public class AbsSeq {
	//@ ensures (num < 0) ==> (\result == -num);
	//@ ensures (num >= 0) ==> (\result == num);
	public int Abs(int num) {
		return ((num < 0) ? (-num) : (num));
	}

}
