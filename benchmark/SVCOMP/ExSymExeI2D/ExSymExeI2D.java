class Main {

  public static boolean main(int x) {
    x = x > 0 ? x % 10 : -(x % 10);

    Main inst = new Main();
    return inst.test(x);
  }

  public boolean test(int x) {
    double res = (double) ++x;
    if (res > 0) System.out.println("x >0");
    else {
      return false;
    }
    return true;
  }
}
