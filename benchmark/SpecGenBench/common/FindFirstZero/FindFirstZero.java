public class FindFirstZero {

    	 public static int FindFirstZero(int[] x) {
         	assert x.length >= 0;
         	if (x.length == 0) {
            		return -1;
        	} else {
            		int index = 0;

            		while (x.length - index > 0 && x[index] != 0) {
                		index = index + 1;
            		}
            		if (x.length - index == 0) {
               			index = -1;
            		}
            	return index;
        	}
    	}
}

