class Main {
  static class Node {

    public boolean test(int a, int b) {

      if (a > b) {
        return false;
      } else if (a == b) System.out.println("eq");
      else
        System.out.println("<");
      return true;
    }
  }

  public static boolean f(int arg) {
    if (arg >= Integer.MAX_VALUE) return true;
    Main inst = new Main();
    Node n = new Node();
    return n.test(arg, arg + 1);
  }
}
