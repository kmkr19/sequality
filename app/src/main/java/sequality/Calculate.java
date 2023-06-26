package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumAll(int x, int y) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }

  public double average(int x, int y) {
    double y1 = (double) y;
    double ave = x / y1;
    return ave;
  }

  public int sumodd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumother(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
