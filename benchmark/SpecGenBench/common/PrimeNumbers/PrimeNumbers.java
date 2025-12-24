
    public class PrimeNumbers
    {
        
        private  static boolean div(int n, int d) { return n%d == 0; }

        private  int primeArray[];
        
        public int[] primeList(int n)
        {
          int status = 1, num = 3, count, j;
          primeArray = new int[n];
          primeArray[0] = 2;
  
          for (count = 2; count <= n;)
          { 

             for (j = 2; j <= num/2; j++)
             { 
                if (div(num,j))
                {
                   status = 0;
                   break;
                }
             }

             if (status != 0)
             {  
                primeArray[count - 1] = num;
                count++;
		
             }
             status = 1;
	     
             num++;
          } 
	      return primeArray; 
       }
    }
