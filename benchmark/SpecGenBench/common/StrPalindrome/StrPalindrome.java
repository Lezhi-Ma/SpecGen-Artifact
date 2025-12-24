public class StrPalindrome {
   
   public boolean isPalindrome(String str) {
      String reverse = "";
      
      int length = str.length();

      for (int i = length - 1; 0 <= i; i--) {
         reverse = reverse + str.charAt(i);
	 
      }
      
      return reverse.equals(str);
   }

} 
