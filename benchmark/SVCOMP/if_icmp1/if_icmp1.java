class if_icmp1 {
  private static boolean f(int i, int j) {
    if (i == j) {
      return false;
    }
    if (i >= j) {
      return false;
    }
    if (2 > 1) {
      if (j > i) {
        return true;
      } else {
        return false;
      }
    }
    if (j <= i) {
      return false;
    }
    if (j < i) {
      return false;
    } else {
      return true;
    }
  }

  public static boolean fun(int i) {
    if (i + 1 < 0) return true;
    return f(i, i + 1);
  }
}
