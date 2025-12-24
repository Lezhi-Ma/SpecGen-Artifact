public class ChangeCase {
  //@ ensures (c > 'z') ==> (\result == c);
  //@ ensures (c <= 'z' && c >= 'a') ==> (\result == (char)(c - 'a' + 'A'));
  //@ ensures (c <= 'z' && c < 'a' && c > 'Z') ==> (\result == c);
  //@ ensures (c <= 'z' && c < 'a' && c <= 'Z' && c >= 'A') ==> (\result == (char)(c - 'A' + 'a'));
  //@ ensures (c <= 'z' && c < 'a' && c <= 'Z' && c < 'A') ==> (\result == c);  
  public char changeCase(char c) {
    char result = ' ';    
    if (c > 'z') {
      result = c;
    } else if (c >= 'a') {
      result =  (char)(c - 'a' + 'A');
    } else if (c > 'Z') {
      result =  c;
    } else if (c >= 'A') {
      result =  (char)(c - 'A' + 'a');
    } else {
      result = c;
    }
    return result;
  }

}
