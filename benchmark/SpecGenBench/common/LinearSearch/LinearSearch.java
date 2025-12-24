  public class LinearSearch {
     private static  int location;

      public static int linearSearch(int search, int array[]) {
	      int c;

        for (c = 0; c < array.length; c++) {  
          if (array[c] == search) {
	      location = c;
              break;
          }
        }
       if (c == array.length) {
            location = -1;
       }
     return location;
     }
  }
