public class ArithmeticException5 {
  public static boolean arithmeticException5(double i) {
    try {
      double j = 10 / i;
    } catch (ArithmeticException exc) {
      return false;
    }
    return true;
  }
}
