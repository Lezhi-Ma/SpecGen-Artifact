class Main {
  public static boolean g (int arg) {
    if (arg == 0)
      return (new Main()).f(0, arg);
    return true;
  }

  public boolean f(int a, int b) {
    Integer i = null;
    if (a < 5) {
      i = Integer.valueOf(4);
      i.floatValue();
    } else
      return false;
    return true;
  }
}
