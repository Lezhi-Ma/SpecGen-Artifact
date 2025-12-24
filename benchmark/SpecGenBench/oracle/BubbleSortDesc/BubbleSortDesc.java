public class BubbleSortDesc {
    /*@ requires 0 <= x && x < array.length && 0 <= y && y < array.length; 
      @ assignable array[x], array[y]; 
      @ ensures \old(array[x]) == array[y] && \old(array[y]) == array[x];
      @ ensures array.length == \old(array.length); @*/
    void swap(int x, int y,  int array[]) {
        int temp;     
        temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    //@ requires 0 < arr.length;
    //@ ensures \forall int i; 0 <= i && i < \result.length; \forall int j; i <= j && j < \result.length; \result[i] >= \result[j];
    int[] bubbleSort(int arr[]) { 
        int n = arr.length;
	
	//@ maintaining n == arr.length;
	//@ maintaining 0 <= i && i < n; 
	//@ maintaining 0 < i ==> (\forall int k; 0 <= k && k < n-i; arr[k] >= arr[n-i]);
	//@ maintaining  (\forall int t; n-i <= t && t < n; arr[n-i] >= arr[t]);
	//@ maintaining 0 < i ==> (\forall int h; n-i <= h && h < n; (\forall int p; n-i <= p && p < n && p <= h; arr[p] >= arr[h]));
 	//@ decreases n - i;
        for (int i = 0; i < n-1; i++) {	
	    //@ maintaining 0 <= i && i < n - 1;
	    //@ maintaining 0 <= j && j < n - i;
	    //@ maintaining 0 < j ==> arr[j-1] >= arr[j];
	    //@ maintaining (\forall int k; 0 <= k && k < j; arr[k] >= arr[j]);
	    //@ maintaining 0 < j  && j < n - i ==> (\forall int t; n-i <= t && t < n; arr[j] >= arr[t]);
	    //@ decreases n - j;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j+1] > arr[j]) {  
		    swap(j, j + 1, arr); 
                } 
	    }
	} 
	return arr;
    } 
}

