//105,102,357 prime numbers exist between 1 to Integer.MAX_VALUE. Also, the Integer.MAX_VALUE is a prime number. 
public class PrimeNumbers
{
    /*@ private normal_behavior  
 @    requires 2 <= n;
      @    requires 2 <= d;
 @    ensures \result ==> n%d == 0; 
      @    pure @*/
    private /*@ spec_public @*/ static boolean div(int n, int d) { return n%d == 0; }

    private /*@ spec_public nullable @*/ int primeArray[];
    /*@ requires 0 < n && n <= 105102357;
      @ assignable primeArray;
 @ ensures \forall int i; 0 <= i && i < primeArray.length; \forall int j; 2 <= j && j <= primeArray[i]/2; !div(primeArray[i],j);
 @ ensures (\forall int i,j; 0 <= i && i < primeArray.length && 0 <= j && j < primeArray.length && i != j; primeArray[i] != primeArray[j]);
 @ ensures \forall int i; 0 <= i && i < primeArray.length; \forall int j; 0 <= j && j < primeArray.length && i != j; primeArray[i] != primeArray[j]; 
 @ ensures primeArray.length == n; @*/
    public int[] primeList(int n)
    {
      int status = 1, num = 3, count, j;
      primeArray = new int[n];
      primeArray[0] = 2;
 //@ assert primeArray.length == n;

      /*@ ghost int maxnumber = Integer.MAX_VALUE;
   @ ghost int count_counter = 2;
   @ maintaining (\forall int i; 0 <= i && i < count-1; (\forall int k;  2 <= k && k <= primeArray[i]/2; !div(primeArray[i],k)));
   @ maintaining (\forall int i; 0 <= i && i < count-1; \forall int k; 0 <= k && k < count-1 && i != k;  primeArray[i] != primeArray[k]);
   @ maintaining (\forall int i; 0 <= i && i < count-1; primeArray[i] < num);
        @ maintaining 2 <= count && count <= n + 1 && 3 <= num;
   @ maintaining count_counter == count;
   @ loop_invariant status == 1;
        @ decreases maxnumber - num; @*/
      for (count = 2; count <= n;)
      { 
         //@ maintaining j > 1 && j <= num/2 + 1;
    //@ maintaining (\forall int k; 0 <= k && k < count - 1; num != primeArray[k]);
    //@ maintaining (\forall int k; 2 <= k && k < j; !div(num,k));
         //@ decreases num - j;
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
  //@ set count_counter = count_counter + 1;
         }
         status = 1;
    //@ assume num < Integer.MAX_VALUE;
         num++;
      } 
return primeArray; 
   }
}
