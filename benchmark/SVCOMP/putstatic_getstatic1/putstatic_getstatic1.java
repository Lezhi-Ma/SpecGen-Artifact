class A {
  public static int i = 1;
}
;

class putstatic_getstatic1 {
  public static boolean f() {
    if(A.i != 1) return false;
    A.i = 999;
    if (A.i != 999)
      return false;
    return true;
  }
}
