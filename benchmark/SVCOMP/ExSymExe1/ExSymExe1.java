class ExSymExe1 {
  public boolean test(int x, int z) {
    System.out.println("Testing ExSymExe1");
    x = z++;
    if (z > 0) System.out.println("branch FOO1");
    else {
      System.out.println("branch FOO2");
      return false;
    }
    if (x > 0) System.out.println("branch BOO1");
    else {
      System.out.println("branch BOO2");
      return false;
    }
    return true;
  }
}
