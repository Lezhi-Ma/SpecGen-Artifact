public class Fibonacci {
   	private /*@ spec_public @*/ long fib[];
	//@ public invariant 2 <= fib.length && fib.length <= 93; // 93 < size ==> Long Overflow 

	//@ ensures fib[0] == 0 && fib[1] == 1;
	Fibonacci() {
		fib = new long[2];
		fib[0] = 0;
		fib[1] = 1;
	}
	/*@ 	public normal_behavior
	  @ 		requires 2 <= size && size <= 93;
	  @ 		ensures fib[0] == 0 && fib[1] == 1;
	  @ 		ensures (\forall int i; 2 <= i && i < fib.length; fib[i] == 0);
	  @ also
	  @ 	public exceptional_behavior
   	  @ 		requires size < 2 || 93 < size;
	  @		assignable \nothing;
	  @ 		signals_only IllegalArgumentException; @*/ 	
	/*@ spec_public @*/ Fibonacci(int size) {
		if (2 <= size && size <= 93) {
			fib = new long[size];	
			fib[0] = 0;
			fib[1] = 1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	//@ requires 0 <= index && index < fib.length;
	//@ ensures \result == fib[index];
	public /*@ pure @*/ long getFib(int index) {
		return fib[index];
	}
	
	//@ requires fib[0] == 0 && fib[1] == 1;
	//@ assignable fib[2 .. fib.length-1]; 
	//@ ensures (\forall int i; 2 <= i && i < fib.length; fib[i] == fib[i-1] + fib[i-2]); 
	//@ ensures (\forall int i; 2 <= i && i < fib.length; (\forall int j; 2 <= j && j < i; fib[j] < fib[i]));
	public void fibCompute() {
		int index = 2;
		//@ maintaining 2 <= index && index <= fib.length;
                //@ maintaining (\forall int i; 2 <= i && i < index; fib[i] == fib[i-1] + fib[i-2]);
                //@ maintaining (\forall int i; 2 <= i && i < index; (\forall int j; 2 <= j && j < i; fib[j] < fib[i]));
		while (index < fib.length) {
			//@ assume fib[index - 2] + fib[index - 1] <= Long.MAX_VALUE;
			//@ assume 0 < fib[index - 2] + fib[index - 1];
			fib[index] = fib[index - 2] + fib[index - 1];
			index++;
                        //@ assume fib[index-2] <  fib[index-1];
		}
	}
}

