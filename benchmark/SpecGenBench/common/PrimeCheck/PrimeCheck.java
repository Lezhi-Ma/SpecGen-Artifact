class PrimeCheck {
   
	public boolean isPrime(int a) {
		int i = 2;
		int mid = a/2;

		while (i <= mid) {
			if (a%i == 0)
				return false;
			i++;
		}
		return true;
	}
}
